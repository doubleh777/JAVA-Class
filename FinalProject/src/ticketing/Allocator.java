package ticketing;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import dataio.Client;
import policy.Policy;

public class Allocator {

	Policy policy;
	int numberOfBooth;
	ArrayList<TicketingBooth> Booth;
	Queue<Client> ClientInfo;
	Queue<Client> trainQueue;
	int curTime;
	
	public Allocator(Policy policy, int numberOfBooth){
		this.policy = policy;
		this.numberOfBooth = numberOfBooth;
		this.curTime = 0;
		
		trainQueue = new LinkedList<Client>();
		Booth = new ArrayList<TicketingBooth>(numberOfBooth);
		makeBooth();
	}
	
	public void makeBooth(){   //numberOfBooth의 크기 만큼 Booth 인스턴스 생성
		for(int i= 0 ; i < numberOfBooth; i++){
			Booth.add(i, new TicketingBooth());
		}
	}
	
	public void allocation(){
		
		policy.setBooth(Booth);
		policy.setTrainQueue(trainQueue);
		
		for(curTime = 0 ; curTime<50 ; curTime++){
			policy.policyTemplate();                       // 매 시간마다 체크하여 enqueue, dequeue, 할당여부 결정
			if(curTime%3 == 0) trainDeparture();     // 매 3분마다 기차 출발 
		}
		
		
	}
	
	public void trainDeparture(){
		
	}
	
	
}
