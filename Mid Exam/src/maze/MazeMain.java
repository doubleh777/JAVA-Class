package maze;

import java.io.IOException;
/*
	MazeMain
		1. maze(path=0, wall=1)�� 2���� �迭�� SearchTheRoute �ν��Ͻ��� ����.
 */
public class MazeMain {

	public static void main(String[] args) throws IOException{
		
		int[][] array = { {0,1,1,1,0,1,1,1},
								{0,0,0,1,0,0,0,0},
								{1,1,0,0,0,1,0,1},
								{1,1,0,1,1,1,0,1},
								{1,0,0,1,0,0,0,0},
								{0,1,1,1,0,1,1,1},
								{1,0,1,1,0,0,0,0},
								{0,1,1,0,1,1,1,0} };
		
		SearchTheRoute STR = new SearchTheRoute(array);
		STR.searching();
	}
}
