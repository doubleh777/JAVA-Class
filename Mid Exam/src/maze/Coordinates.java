package maze;
/*
 	Coordinates
 		1. ������ ��ǥ�� �ֱ� ������ ���� ������ ������ �ִ� ��ü.
 		2. ��ǥ�� ������ getter, setter�޼ҵ� ����
 
 */

public class Coordinates {
	private int x;
	private int y;
	private String curDir;
	
	public Coordinates(int x, int y, String curDir){
		this.x = x;
		this.y = y;
		this.curDir = curDir;
	}
	
	public void setCoordinates(int x, int y, String curDir){
		this.x = x;
		this.y = y;
		this.curDir = curDir;
	}
	
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public String getCurDir(){
		return curDir;
	}
}
