package maze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
 	SearchTheRoute
 		1. Boundary Condition을 위해 생성자에서 boundaryCondition 메소드를 호출하여
 			maze주위를 1로 감싸도록 만듬.
 		2. Searching메소드에서는 환경변수에 따라 Check4Direction 또는 Check8Direction 인스턴스를
 			생성하여 ICheckDirection 인터페이스에서 implement된 checkDirection메소드를 호출.
 */

public class SearchTheRoute{
	
	int i;
	int j;
	int[][] maze = new int[10][10];
	int numberOfDirection;
	ICheckDirection selectNumberOfDirection;
	
	public SearchTheRoute(int[][] array) throws IOException{
		this.boundaryCondition(array);
	}
	
	public void boundaryCondition(int[][] array){
		
		for(i = 0 ; i < 10 ; i++){
			for(j = 0 ; j< 10 ; j++){
				maze[i][j] = 1; // maze를 전체 1로 초기화
			}
		}
	
		for(i = 1 ; i< 9 ; i++){
			for(j = 1 ; j<9 ; j++){
				maze[i][j] = array[i-1][j-1];  // 입력된 배열을 1로 둘러쌈
			}
		}
	}
	
	public void searching() throws IOException{
		
		Properties props = new Properties();
		FileInputStream in = new FileInputStream("DirectionType");
		props.load(in);
		String directionType = props.getProperty("directionType");
		ICheckDirection direction;
		
		if(directionType.equals("4")){
			direction = new Check4Direction(maze);
			direction.checkDirection();
		}
		else if(directionType.equals("8")){
			direction = new Check8Direction(maze);
			direction.checkDirection();
		}
		
		else System.out.println("You have to select the number of direction 4 or 8.");
	}
}
