package it.tramways.analysis.persistable.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import it.tramways.analysis.api.model.AnalysisResult;
import java.io.IOException;
import org.slf4j.LoggerFactory;

public class AnalysisResultJsonMapper {

	private ObjectMapper mapper;

	public AnalysisResultJsonMapper() {
		mapper = new ObjectMapper();
	}

	public AnalysisResult map(String json) {
		try {
			return mapper.readValue(json, AnalysisResult.class);
		} catch (IOException e) {
			LoggerFactory.getLogger(getClass()).error("Error", e);
			return null;
		}
	}

	public String map(AnalysisResult result) {
		try {
			return mapper.writeValueAsString(result);
		} catch (JsonProcessingException e) {
			LoggerFactory.getLogger(getClass()).error("Error", e);
			return null;
		}
	}

}
