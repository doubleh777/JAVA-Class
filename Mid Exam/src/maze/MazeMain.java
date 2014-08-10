package maze;

import java.io.IOException;
/*
	MazeMain
		1. maze(path=0, wall=1)를 2차원 배열로 SearchTheRoute 인스턴스에 전달.
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
