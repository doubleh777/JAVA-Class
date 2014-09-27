package policy;

import java.util.ArrayList;
import java.util.Queue;

import ticketing.TicketingBooth;
import dataio.Client;

public interface Policy {

	public Client dequeue();
	public void allocation();
	
	public void policyTemplate();
	public void setBooth(ArrayList<TicketingBooth> booth);
	public void setTrainQueue(Queue<Client> trainQueue);
}
