package ticketing;

import java.util.LinkedList;
import java.util.Queue;

import dataio.Client;

public class dijkstraAlgorithm {

	Queue<Client> middleClientInfo;
	Queue<Client> finalClientInfo;
	
	public dijkstraAlgorithm(Queue<Client> middleClientInfo) {
		this.middleClientInfo = middleClientInfo;
		finalClientInfo = new LinkedList<Client>();
	}

}
