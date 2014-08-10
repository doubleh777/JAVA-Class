package maze;
/*
 	Check4Direction
 		1. 4���� Ž���� ���� ��ü(checkDirection�޼ҵ�).
 		2. x, y���� �ʱ��� ��ǥ�� (1, 1)�� �ʱ�ȭ.
 			Coordinates �ν��Ͻ��� XY�� ��ǥ�� �ӽ÷� �����ϱ� ���� temporary����.
 		3. �����ڿ����� maze�� �Է¹ް�, �ʱ���ǥ�� stack�� push
 			(�ʱ��� stack empty�� ���� ���� ��ã�� ����� stack empty�� �������� �ʴ� ��츦 ����
 			�ϱ� ���� �̸� ù��° ��ǥ�� stack�� push)
 		4. route, ���Ƴ��� path �Ǵ� Ž������ ���� path, wall�� �����ϱ� ����
 			route���� 7, ���Ƴ��� path���� 2, Ž������ ���� path�� 0, wall�� 1�� �Է�.
 		5. stack2�� �����Ͽ� stack���� pop�ؼ� �ٷ� push(stack �����͸� �Ųٷ� ����)�Ͽ�
 			��½� ��θ� ���ʷ� �����.
 		6. ���� ã�� ���� stack�� empty�� ��� stack���� null�� ��ȯ�ϵ��� �Ͽ� null�� ��ȯ �Ǿ��� ��
 			������ route�� ������ ���.
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
			int order = 0;  // ��� �� ������ ǥ���ϱ� ���� ����
			maze[8][8] = 7;
			stack.push(XY);
			
			stack2 = new Stack();
			while(XY != null){         //stack2�� ��θ� ó������ ���ʷ� 
				XY = stack.pop();      //����ϱ����� ������ �Ųٷ� ��� �뵵
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
							System.out.print("��  "); // route
						else if(maze[i][j] == 1)
							System.out.print("��  "); // ��
						else if(maze[i][j] == 0 || maze[i][j] == 2)
							System.out.print("��  "); // ������ �ʾҰų� ���Ƴ��� ��
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
			
			maze[x][y] = 7; // route���� 7�� �Է���
			
			if(XY.getCurDir() == null){
				stack.pop();  // �ʱ��� empty���ð� ���� ��ã���� ���� empty������ �����ϱ� ����
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
			
			maze[x][y] = 2;  // ���� ���� ���Ƴ��� ���� 2 �Է���
			XY = stack.pop();
			XY = stack.pop();
			if(XY == null){  // �̷ο��� �ᱹ ���� �� ã�� ���ÿ��� null�� ������ ��� 
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
