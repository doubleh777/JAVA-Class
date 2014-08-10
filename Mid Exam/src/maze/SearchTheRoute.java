package maze;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/*
 	SearchTheRoute
 		1. Boundary Condition�� ���� �����ڿ��� boundaryCondition �޼ҵ带 ȣ���Ͽ�
 			maze������ 1�� ���ε��� ����.
 		2. Searching�޼ҵ忡���� ȯ�溯���� ���� Check4Direction �Ǵ� Check8Direction �ν��Ͻ���
 			�����Ͽ� ICheckDirection �������̽����� implement�� checkDirection�޼ҵ带 ȣ��.
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
				maze[i][j] = 1; // maze�� ��ü 1�� �ʱ�ȭ
			}
		}
	
		for(i = 1 ; i< 9 ; i++){
			for(j = 1 ; j<9 ; j++){
				maze[i][j] = array[i-1][j-1];  // �Էµ� �迭�� 1�� �ѷ���
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
