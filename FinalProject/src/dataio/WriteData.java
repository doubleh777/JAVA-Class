package dataio;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.Queue;

public class WriteData {

	private FileOutputStream fos;        
	private OutputStreamWriter osr;   
	private BufferedWriter bw;         
	private static String FileName;
	private Queue<Client> clientInfo;

	public WriteData (String fileName, Queue<Client> clientInfo){
		this.clientInfo = clientInfo;
		setFileName(fileName);
	}
	
	public static void setFileName(String fileName){
		FileName = fileName;
	}
	public void writeClientData() throws IOException{
		if(this.FileName != null){
			fos = new FileOutputStream(FileName);
			osr = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osr);
			
			Iterator<Client> iterator = clientInfo.iterator();
			
			while(iterator.hasNext()){
				bw.write(iterator.next().getInfo() + "\r\n");
			}
		if(bw != null)
			bw.close();
	
		}
		else{
			throw new FileNotFoundException();  // 파일명이 없을 경우의 예외처리
		}
	
	}
	
}
