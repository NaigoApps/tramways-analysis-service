package it.tramways.analysis.roadmap.graph;

public interface Arc<T extends Node> {
	T getSource();
	T getDestination();
}
