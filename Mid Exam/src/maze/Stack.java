package maze;
/*
 	Stack
 	 	1. Coordinates(움직인 좌표와 최근 방향 정보를 가진 객체)를 저장하는 stack.
		2. 생성자에서는 초기 size로 64를 지정( n(O) = n^2(한 번 방문한 좌표는 다시 가지 않음, 8 X 8 = 64).
 		3. push메소드는 Coordinates인스턴스를 입력받아 stack에 저장.
 		4. pop메소드는 스택 저장된 데이터 중 가장 위의 데이터를 반환함.
 			stack이  empty일 경우 null을 반환.
 */
public class Stack {

	protected Coordinates[] coordinates;
	protected int increment;
	
	public Stack(){
		coordinates = new Coordinates[64];
	}
		
	public void push(Coordinates XY){
		Coordinates tmp = new Coordinates(XY.getX(), XY.getY(), XY.getCurDir());
		coordinates[increment++] = tmp;
	}
	
	public Coordinates pop(){
		if (increment == 0){
			return null;
		}
		
		Coordinates XY = coordinates[--increment];
		coordinates[increment] = null;
		
		return XY;
	}

	
}

