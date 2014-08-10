package maze;
/*
 	Check4Direction
 		1. 4방향 탐색을 위한 객체(checkDirection메소드).
 		2. x, y값은 초기의 좌표인 (1, 1)로 초기화.
 			Coordinates 인스턴스인 XY는 좌표를 임시로 저장하기 위한 temporary변수.
 		3. 생성자에서는 maze를 입력받고, 초기좌표를 stack에 push
 			(초기의 stack empty로 인해 길을 못찾은 경우의 stack empty와 구별되지 않는 경우를 배제
 			하기 위해 미리 첫번째 좌표를 stack에 push)
 		4. route, 돌아나온 path 또는 탐색하지 않은 path, wall을 구분하기 위해
 			route에는 7, 돌아나온 path에는 2, 탐색하지 않은 path는 0, wall은 1을 입력.
 		5. stack2를 생성하여 stack에서 pop해서 바로 push(stack 데이터를 거꾸로 저장)하여
 			출력시 경로를 차례로 출력함.
 		6. 길을 찾지 못해 stack이 empty될 경우 stack에서 null을 반환하도록 하여 null이 반환 되었을 때
 			가능한 route가 없음을 출력.
 */

public class Check4Direction implements ICheckDirection{

	private int x = 1;
	private int y = 1;
	private int[][] maze;
	private Coordinates XY = new Coordinates(x, y, null); 
	private Stack stack = new Stack();
	private Stack stack2;
	
	public Check4Direction(int[][] maze){
		this.maze = maze;
		stack.push(XY);
	}
	
	@Override
	public void checkDirection() {
	
		if(XY.getX()==8 && XY.getY()==8){
			int order = 0;  // 출력 시 순서를 표시하기 위한 변수
			maze[8][8] = 7;
			stack.push(XY);
			
			stack2 = new Stack();
			while(XY != null){         //stack2는 경로를 처음부터 차례로 
				XY = stack.pop();      //출력하기위해 스택을 거꾸로 담는 용도
				if(XY == null)
					break;
				stack2.push(XY);
			}
			
			System.out.println("This is the route. (Direction4)");
			System.out.println("");
			System.out.println("    1  2  3   4   5  6  7   8");
				for(int i = 1 ; i<9 ; i++){
					System.out.print(i + " ");
					
					for(int j = 1; j<9 ; j++){
						if(maze[i][j] == 7)
							System.out.print("◇  "); // route
						else if(maze[i][j] == 1)
							System.out.print("▩  "); // 벽
						else if(maze[i][j] == 0 || maze[i][j] == 2)
							System.out.print("◆  "); // 가보지 않았거나 돌아나온 길
					}
					System.out.println("");
				}
				System.out.println("");
				
				while((XY=stack2.pop()) != null){
					System.out.println(++order +". "+"("+XY.getX()+", "+ XY.getY() + ")");
				}
			
			System.exit(0);
	}
		
		if(maze[x][y] == 1){
			XY = stack.pop();
			x = XY.getX();
			y = XY.getY();
			stack.push(XY);
		}
		else{
			
			maze[x][y] = 7; // route에는 7을 입력함
			
			if(XY.getCurDir() == null){
				stack.pop();  // 초기의 empty스택과 길을 못찾았을 때의 empty스택을 구분하기 위함
				XY.setCoordinates(x, y, "Left");
			}
			
			
			if(XY.getCurDir() == "Right"){	
				stack.push(XY);
				this.gotoRight();
				this.gotoDown();
				this.gotoUp();
				}
			
			else if(XY.getCurDir() == "Down"){	
				stack.push(XY);
				this.gotoRight();
				this.gotoDown();
				this.gotoLeft();
				}
			
			else if(XY.getCurDir() == "Left"){	
				stack.push(XY);
				this.gotoDown();
				this.gotoLeft();
				this.gotoUp();
				}
			
			else if(XY.getCurDir() == "Up"){	
				stack.push(XY);
				this.gotoRight();
				this.gotoLeft();
				this.gotoUp();
				}
			
			maze[x][y] = 2;  // 길이 없어 돌아나온 경우는 2 입력함
			XY = stack.pop();
			XY = stack.pop();
			if(XY == null){  // 미로에서 결국 길을 못 찾아 스택에서 null을 리턴할 경우 
				System.out.println("A route don't exist.");
				System.exit(0);
			}
			x= XY.getX();
			y= XY.getY();
			stack.push(XY);
		}
	}
	
	public void gotoRight(){
		y = y+1;
		XY.setCoordinates(x, y, "Right");
		this.checkDirection();
	}
	public void gotoDown(){
		x = x+1;
		XY.setCoordinates(x, y, "Down");
		this.checkDirection();
	}
	public void gotoLeft(){
		y = y-1;
		XY.setCoordinates(x, y, "Left");
		this.checkDirection();
	}
	public void gotoUp(){
		x = x-1;
		XY.setCoordinates(x, y, "Up");
		this.checkDirection();
	}

}
