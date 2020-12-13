package it.tramways.analysis.roadmap.graph;

import java.util.List;

public interface Node<T extends Arc> {
	List<T> getSources();
	List<T> getDestinations();
}
