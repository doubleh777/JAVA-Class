package policy;

import java.util.ArrayList;
import java.util.Queue;



import ticketing.TicketingBooth;
import dataio.Client;

public class FCFS implements Policy{

	Queue<Client> clientInfo;
	ArrayList<TicketingBooth> booth;
	Queue<Client> trainQueue;
	
	public FCFS(Queue<Client> clientInfo){
		this.clientInfo = clientInfo;
	}
	public void setBooth(ArrayList<TicketingBooth> booth) {
		this.booth = booth;
	}

	
	public void allocation() {
		
	}
	public Client dequeue() {
		
		return null;
	}
	
	public void enqueueToTrain(){
		
	}
	
	public void policyTemplate() {
		dequeue();
		allocation();
		enqueueToTrain();
	}

	public void setTrainQueue(Queue<Client> trainQueue) {
		this.trainQueue = trainQueue;	
	}

	

	
}
