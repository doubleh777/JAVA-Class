package policy;

import java.util.ArrayList;
import java.util.Queue;

import ticketing.TicketingBooth;
import dataio.Client;

public class SJF implements Policy{

	Queue<Client> clientInfo;
	ArrayList<TicketingBooth> booth;
	Queue<Client> trainQueue;
	
	public SJF(Queue<Client> clientInfo){
		this.clientInfo = clientInfo;
	}
	
	public void setBooth(ArrayList<TicketingBooth> booth) {
		this. booth = booth;	
	}
	public void setTrainQueue(Queue<Client> trainQueue) {
		this.trainQueue = trainQueue;	
	}
	
	public Client dequeue() {
		return null;
	}

	public void allocation() {
		
	}
	
	public void enqueueToTrain(){
		
	}
	
	public void policyTemplate() {
		dequeue();
		allocation();
		enqueueToTrain();
	}


}
