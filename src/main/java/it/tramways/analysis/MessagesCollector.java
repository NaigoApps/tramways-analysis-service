package it.tramways.analysis;

import java.util.List;

public interface MessagesCollector {
	boolean addMessage(String message);
	List<String> listMessages();
}
