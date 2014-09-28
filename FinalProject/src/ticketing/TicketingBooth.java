package ticketing;

import java.util.LinkedList;
import java.util.Queue;

import dataio.Client;

public class TicketingBooth {
	
	public Client curClient;
	public boolean occupied = false;
	public int curTime;
	public Queue<Client> trainQueue;

	
	public TicketingBooth(Queue<Client> trainQueue){
		this.trainQueue = trainQueue;
	}
	
	public void setCurClient(Client curClient) {
		this.curClient = curClient;
		occupied = true;
		curClient.setStartOfTicketingTime(curTime);
	}
	
	public void enqueueToTrain(){
	
		if(curClient != null &&curTime == curClient.getStartOfTicketingTime()+curClient.getTicketingTurnaroundTime()){
			curClient.setEndOfTicketingTime(curTime);
			trainQueue.offer(curClient);
			curClient = null;
			occupied = false;
			
		}

	}

	
}
