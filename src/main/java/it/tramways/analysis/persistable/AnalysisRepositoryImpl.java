package it.tramways.analysis.persistable;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class AnalysisRepositoryImpl extends TramwaysRepository<Analysis> implements
    AnalysisRepository {

    private final EntityManager entityManager;

    public AnalysisRepositoryImpl(EntityManager em) {
        super(Analysis.class, em);
        this.entityManager = em;
    }
}
