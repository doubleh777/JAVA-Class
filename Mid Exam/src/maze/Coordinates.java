package maze;
/*
 	Coordinates
 		1. 움직인 좌표와 최근 움직인 방향 정보를 가지고 있는 객체.
 		2. 좌표와 방향의 getter, setter메소드 포함
 
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
