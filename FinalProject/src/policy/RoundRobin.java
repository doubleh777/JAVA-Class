package policy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import ticketing.TicketingBooth;
import dataio.Client;

public class RoundRobin implements Policy{

	Queue<Client> clientInfo;
	ArrayList<TicketingBooth> booth;
	Queue<Client> trainQueue;
	Queue<Client> waitingRoom;
	int curTime = 0;
	int allocationNumber = 0;
	
	public RoundRobin(Queue<Client> clientInfo){
		this.clientInfo = clientInfo;
		waitingRoom = new LinkedList<Client>();
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
				waitingRoom.offer(clientBuffer);
		}
		
	}

	public void allocation() {   //booth에 할당하고 티켓팅을 완료한 사람을 기차 대기열에 넣는 메소드
		for(int i = 0 ; i< booth.size(); i++){
			booth.get(i).curTime = curTime;  // 현재 시간으로 세팅
			booth.get(i).enqueueToTrain();   // 부스에 자리를 비워주기 위해 티켓팅이 끝난 사람을 기차 대기열로 옮김
		
//			if(allocationNumber%booth.size() == i){
//				if(booth.get(i).occupied == false && waitingRoom.peek() != null){
//						booth.get(i).setCurClient(waitingRoom.poll());
//						allocationNumber++;
//				}else return;
//			}
		}
		for(int i = 0 ; i < booth.size() ; i++){
			if(allocationNumber%booth.size() == i){
				if(booth.get(i).occupied == false && waitingRoom.peek() != null){
					booth.get(i).setCurClient(waitingRoom.poll());
					allocationNumber++;
				}else return;
			}
		}

	}
				

	
	public void policyTemplate() {
		dequeue();
		allocation();
	}

	
}
