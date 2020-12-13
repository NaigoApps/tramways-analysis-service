package it.tramways.analysis.roadmap.priority;

import java.util.Set;
import tramways.core.model.roadmap.lanes.LaneSegment;

public class SensorPriorityManager extends PriorityManager {

	private Set<LaneSegment> activators;

	public Set<LaneSegment> getActivators() {
		return activators;
	}

	public void setActivators(Set<LaneSegment> activators) {
		this.activators = activators;
	}

}
