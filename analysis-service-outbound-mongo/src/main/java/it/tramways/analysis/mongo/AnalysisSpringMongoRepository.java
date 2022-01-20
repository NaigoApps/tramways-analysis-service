package it.tramways.analysis.mongo;

import it.tramways.analysis.mongo.model.AnalysisEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnalysisSpringMongoRepository extends MongoRepository<AnalysisEntity, Long> {

}
