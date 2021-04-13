package it.tramways.analysis.rest;

import it.tramways.analysis.api.AnalysisApi;
import it.tramways.analysis.api.model.AnalysisType;
import java.util.List;
import java.util.stream.Collectors;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;

public class AnalysisController implements AnalysisApi {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public ResponseEntity<List<AnalysisType>> getAvailableAnalysis(@NotNull @Valid String projectId,
        @NotNull @Valid String mapId) {
        return ResponseEntity.ok(discoveryClient.getServices().stream().map(service -> {
            AnalysisType type = new AnalysisType();
            type.setId(service);
            type.setName(service);
            return type;
        }).collect(Collectors.toList()));
    }
}
