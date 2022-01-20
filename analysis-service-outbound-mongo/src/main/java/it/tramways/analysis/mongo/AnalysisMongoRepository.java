package it.tramways.analysis.mongo;

import it.tramways.analysis.api.AnalysisRepository;
import it.tramways.analysis.api.v1.model.Analysis;
import it.tramways.analysis.api.v1.model.AnalysisDescription;
import it.tramways.analysis.mongo.model.AnalysisEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class AnalysisMongoRepository implements AnalysisRepository {

    private final AnalysisSpringMongoRepository analysisDelegate;

    @Autowired
    public AnalysisMongoRepository(
            AnalysisSpringMongoRepository analysisDelegate
    ) {
        this.analysisDelegate = analysisDelegate;
    }

    @Override
    public List<AnalysisDescription> findProjectAnalysis(String projectUuid) {
        return analysisDelegate.findAll(analysisWithProject(projectUuid)).stream()
                .map(this::convertAnalysis).collect(
                        Collectors.toList());
    }

    private AnalysisDescription convertAnalysis(AnalysisEntity entity) {
        AnalysisDescription result = new AnalysisDescription();
        result.setUuid(entity.getUuid());
        result.setName(entity.getName());
        return result;
    }

    @Override
    public Analysis findAnalysis(String uuid) {
        return analysisDelegate.findOne(analysisWithUuid(uuid)).orElse(null);
    }

    @Override
    public Analysis createAnalysis(Analysis analysis) {
        return analysisDelegate.insert(AnalysisEntity.from(analysis));
    }

    @Override
    public Analysis updateAnalysis(Analysis analysis) {
        Optional<AnalysisEntity> optTarget = analysisDelegate
                .findOne(analysisWithUuid(analysis.getUuid()));
        if (optTarget.isPresent()) {
            AnalysisEntity target = optTarget.get();
            AnalysisEntity from = AnalysisEntity.from(analysis);
            from.setId(target.getId());
            analysisDelegate.save(from);
        }
        return analysis;
    }

    @Override
    public void deleteAnalysis(String uuid) {
        analysisDelegate.findOne(analysisWithUuid(uuid)).ifPresent(analysisDelegate::delete);
    }

    private Example<AnalysisEntity> analysisWithProject(String projectUuid) {
        AnalysisEntity probe = new AnalysisEntity();
        probe.setProjectUuid(projectUuid);
        return Example.of(probe);
    }

    private Example<AnalysisEntity> analysisWithUuid(String uuid) {
        AnalysisEntity probe = new AnalysisEntity();
        probe.setUuid(uuid);
        return Example.of(probe);
    }

}
