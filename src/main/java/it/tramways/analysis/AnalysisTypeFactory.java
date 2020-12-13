package it.tramways.analysis;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;

public class AnalysisTypeFactory {

	@Autowired
	List<AnalysisType> availableTypes;

	public AnalysisType getType(String name){
		for(AnalysisType t : availableTypes) {
			if(name.equals(t.getId())) {
				return t;
			}
		}
		return null;
	}

	public List<AnalysisType> getTypes(){
		return new ArrayList<>(availableTypes);
	}

}
