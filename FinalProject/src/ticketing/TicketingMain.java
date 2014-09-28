package ticketing;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import dataio.Client;
import dataio.ReadData;
import policy.FCFS;
import policy.Policy;
import policy.Priority;
import policy.RoundRobin;

public class TicketingMain {

	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		Policy policy;  // Client를 Booth에 할당하는 정책을 담기 위한 변수
		Allocator allocator; // 정책에 따라 allocation하여 기차 대기열 큐에 enqueue시켜주고 기차가 출발하면
									//	큐에 있는 모든 고객을 dequeue 시켜주는 역할을 하는 객체(policy manager) 
		
		ReadData readData = ReadData.getInstance("ClientData.csv"); //Data를 읽어오는 인스턴스 생성
		readData.getClientData();  //Data를 파일로부터 읽어옴
		Queue<Client> clientInfo = readData.getClientInfo(); // 고객정보를 담은 LinkedList를 반환
		System.out.println("어떤 방식으로 티켓팅을 하시겠습니까?");
		System.out.println("1. FCFS");
		System.out.println("2. RoundRobin");
		System.out.println("3. PriorityQueue");
		
		while(true){
			int input = scanner.nextInt();
			
			switch(input){
			case 1 : policy = new FCFS(clientInfo); break;
			case 2 : policy = new RoundRobin(clientInfo); break;
			case 3 : policy = new Priority(clientInfo); break;
			default : System.out.println("유효하지 않는 입력입니다."); continue;	
			}
			break;
		}
		
		int numberOfBooth = 3;
		allocator = new Allocator(policy, numberOfBooth);
		
		
		allocator.allocation();   // 정책에 따라 대기열에서 dequeue하여 Booth에 할당하고 기차 대기열에 enqueue한 후 기차출발 시 dequeue
		
		Queue<Client> test = allocator.getMiddleClientInfo();
		for(int i = 0 ; i<50 ; i++){
		System.out.println(test.poll());
		}
		

	}

}
