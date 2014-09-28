package policy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

import ticketing.TicketingBooth;
import dataio.Client;

public class Priority implements Policy{
	
	Queue<Client> clientInfo;
	ArrayList<TicketingBooth> booth;
	Queue<Client> trainQueue;
	PriorityQueue<Client> waitingRoom;
	int curTime = 0;
	int allocationNumber = 0;
	
	public Priority(Queue<Client> clientInfo){
		this.clientInfo = clientInfo;
		waitingRoom = new PriorityQueue<Client>();
	}
	public void setBooth(ArrayList<TicketingBooth> booth) {
		this. booth = booth;
	}
	public void setTrainQueue(Queue<Client> trainQueue) {
		this.trainQueue = trainQueue;	
	}
	public void setCurTime(int curTime) {
		this.curTime = curTime;	
	}

	
	public void dequeue() {
		Iterator<Client> iterator = clientInfo.iterator();
		
		while(iterator.hasNext()){
			Client clientBuffer = iterator.next();
			if(clientBuffer.getStationArrivingTime() == curTime)
				waitingRoom.add(clientBuffer);
		}
		
	}

	public void allocation() {   //booth에 할당하고 티켓팅을 완료한 사람을 기차 대기열에 넣는 메소드
		for(int i = 0 ; i< 3; i++){
			booth.get(i).curTime = curTime;  // 현재 시간으로 세팅
			booth.get(i).enqueueToTrain();   // 부스에 자리를 비워주기 위해 티켓팅이 끝난 사람을 기차 대기열로 옮김
		}
			if(booth.get(0).occupied == false){
				if(waitingRoom.peek() != null) booth.get(0).setCurClient(waitingRoom.poll());
			}
			if(booth.get(1).occupied == false){
				if(waitingRoom.peek() != null) booth.get(1).setCurClient(waitingRoom.poll());
			}
			if(booth.get(2).occupied == false){
				if(waitingRoom.peek() != null) booth.get(2).setCurClient(waitingRoom.poll());
			}
	}

	public void policyTemplate() {
		dequeue();
		allocation();
	}

	
	
}
