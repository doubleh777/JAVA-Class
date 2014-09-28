package ticketing;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import dataio.Client;
import policy.Policy;

public class Allocator {

	Policy policy;
	int numberOfBooth;
	ArrayList<TicketingBooth> Booth;
	Queue<Client> trainQueue;
	Queue<Client> middleClientInfo;  //���ͽ�Ʈ�� �˰����� ���� �����ð��� ������ �ٸ� �������� ��� ������ ������ ������
	int curTime;
	
	public Allocator(Policy policy, int numberOfBooth){
		this.policy = policy;
		this.numberOfBooth = numberOfBooth;
		this.curTime = 0;
		
		trainQueue = new LinkedList<Client>();
		middleClientInfo = new LinkedList<Client>();
		Booth = new ArrayList<TicketingBooth>(numberOfBooth);
		makeBooth();
	}
	
	public void makeBooth(){   //numberOfBooth�� ũ�� ��ŭ Booth �ν��Ͻ� ����
		for(int i= 0 ; i < numberOfBooth; i++){
			Booth.add(i, new TicketingBooth(trainQueue));
		}
	}
	
	public void allocation(){
		
		policy.setBooth(Booth);
		policy.setTrainQueue(trainQueue);
		
		for(curTime = 0 ; curTime<200 ; curTime++){
			policy.setCurTime(curTime);
			policy.policyTemplate();                       // �� �ð����� üũ�Ͽ� enqueue, dequeue, �Ҵ翩�� ����
			if(curTime%3 == 0) trainDeparture();     // �� 3�и��� ���� ��� 
		}
		
		
	}
	
	public void trainDeparture(){
		
		
		for(int i  = 0 ; i < trainQueue.size() ; i++){
			Client buffer = trainQueue.poll();
			buffer.setTrainDepartureTime(curTime);
			middleClientInfo.offer(buffer);
		}
	}
	
	public Queue<Client> getMiddleClientInfo(){
		return middleClientInfo;
	}
	
}
