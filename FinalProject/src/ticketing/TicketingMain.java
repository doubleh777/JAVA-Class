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
		Policy policy;  // Client�� Booth�� �Ҵ��ϴ� ��å�� ��� ���� ����
		Allocator allocator; // ��å�� ���� allocation�Ͽ� ���� ��⿭ ť�� enqueue�����ְ� ������ ����ϸ�
									//	ť�� �ִ� ��� ���� dequeue �����ִ� ������ �ϴ� ��ü(policy manager) 
		
		ReadData readData = ReadData.getInstance("ClientData.csv"); //Data�� �о���� �ν��Ͻ� ����
		readData.getClientData();  //Data�� ���Ϸκ��� �о��
		Queue<Client> clientInfo = readData.getClientInfo(); // �������� ���� LinkedList�� ��ȯ
		System.out.println("� ������� Ƽ������ �Ͻðڽ��ϱ�?");
		System.out.println("1. FCFS");
		System.out.println("2. RoundRobin");
		System.out.println("3. PriorityQueue");
		
		while(true){
			int input = scanner.nextInt();
			
			switch(input){
			case 1 : policy = new FCFS(clientInfo); break;
			case 2 : policy = new RoundRobin(clientInfo); break;
			case 3 : policy = new Priority(clientInfo); break;
			default : System.out.println("��ȿ���� �ʴ� �Է��Դϴ�."); continue;	
			}
			break;
		}
		
		int numberOfBooth = 3;
		allocator = new Allocator(policy, numberOfBooth);
		
		
		allocator.allocation();   // ��å�� ���� ��⿭���� dequeue�Ͽ� Booth�� �Ҵ��ϰ� ���� ��⿭�� enqueue�� �� ������� �� dequeue
		
		Queue<Client> test = allocator.getMiddleClientInfo();
		for(int i = 0 ; i<50 ; i++){
		System.out.println(test.poll());
		}
		

	}

}
