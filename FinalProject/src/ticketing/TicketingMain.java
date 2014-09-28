package ticketing;

import java.io.IOException;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

import dataio.Client;
import dataio.ReadData;
import dataio.WriteData;
import policy.FCFS;
import policy.Policy;
import policy.Priority;
import policy.RoundRobin;
import searchpath.Define;
import searchpath.NoRegionException;
import searchpath.ShortPath;

public class TicketingMain {

	public static void main(String[] args) throws IOException, NoRegionException {
		
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
			default : System.out.println("��ȿ���� ���� �Է��Դϴ�."); continue;	
			}
			break;
		}
		
		int numberOfBooth = 3;
		allocator = new Allocator(policy, numberOfBooth);
		
		
		allocator.allocation();   // ��å�� ���� ��⿭���� dequeue�Ͽ� Booth�� �Ҵ��ϰ� ���� ��⿭�� enqueue�� �� ������� �� dequeue
		
		Queue<Client> finalClientInfo = allocator.getfinalClientInfo();
		Iterator<Client> finalClientInfoIR = finalClientInfo.iterator();
		ShortPath searchPath = new ShortPath();
		
		while(finalClientInfoIR.hasNext()){
			Client buffer = finalClientInfoIR.next();
			String departure = buffer.getDeparture();
			String destination = buffer.getDestination();
			//���ͽ�Ʈ�� �˰����� ���� �ִܰ�θ� ���Ͽ� ���� �ҿ�ð��� ����
			buffer.setTrainTurnaroundTime(searchPath.shortestPath(Define.parseString(departure), Define.parseString(destination), 7));
			buffer.calculateWaitingTime();
		}
		
		Iterator<Client> clientInfoIR = clientInfo.iterator();
																				//sorting�Ͽ� ����ϱ� ����
		while(clientInfoIR.hasNext()){                               //������ clientInfo�� ������Ʈ
			finalClientInfoIR = finalClientInfo.iterator();		
			Client buffer1 = clientInfoIR.next();
			while(finalClientInfoIR.hasNext()){
				Client buffer2 = finalClientInfoIR.next();
				if(buffer1.getiDNumber() == buffer2.getiDNumber()){
					buffer1 = buffer2;
				}
			}
			
		}
				
				
				
		WriteData writeData = new WriteData("finalData.csv", clientInfo);
		writeData.writeClientData();

	}

}
