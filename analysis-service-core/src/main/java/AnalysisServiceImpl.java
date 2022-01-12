import inbound.AnalysisService;
import it.tramways.analysis.api.AnalysisRepository;
import it.tramways.analysis.api.v1.model.Analysis;
import org.springframework.stereotype.Service;

@Service
public class AnalysisServiceImpl implements AnalysisService {

    private final AnalysisRepository repository;

    public AnalysisServiceImpl(
            AnalysisRepository repository
    ) {
        this.repository = repository;
    }

    public Analysis createAnalysis(Analysis command){
        Analysis newAnalysis = repository.createAnalysis(command);
        //TODO Launch analysis
        return newAnalysis;
    }

}
