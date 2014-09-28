package dataio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class ReadData {
	
	private FileInputStream fis;         // ���� �Է��� ���� �⺻ ��Ʈ��
	private InputStreamReader isr;    // byte������ �Է��� ���ڴ����� �Է����� �ٲ��ִ� Wrapper Class
	private BufferedReader br;          // Line������ handling�ϱ� ���� Wrapper Class
	private static String FileName;
	private LinkedList<Client> ClientData;
	private static ReadData readData = new ReadData();  //singleton pattern 
	
	private ReadData (){
	}
	
	public static ReadData getInstance(String fileName){
		if(readData == null) readData = new ReadData();
		setFileName(fileName);
		return readData;
	}
	public static void setFileName(String fileName){
		FileName = fileName;
	}
	public void getClientData() throws IOException{
		if(this.FileName != null){
			fis = new FileInputStream(FileName);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			ClientData = new LinkedList<Client>();
		
			String line;
			Client client = null;

			while ((line = br.readLine()) != null){
				StringTokenizer st = new StringTokenizer(line, ",");  //StringTokenizer Ŭ������ ���� "," ������ ������ ����
				client = new Client(Integer.parseInt(st.nextToken()), st.nextToken(), Integer.parseInt(st.nextToken()),
												Integer.parseInt(st.nextToken()), st.nextToken(), st.nextToken());
			
				ClientData.add(client);
			}
			
			if(br != null) br.close();
		}
		else{
			throw new FileNotFoundException();  // ���ϸ��� ���� ����� ����ó��
		}
	
	}
	
	public LinkedList<Client> getClientInfo(){
		return ClientData;
	}
		
}

