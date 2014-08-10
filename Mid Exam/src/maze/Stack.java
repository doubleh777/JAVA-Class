package maze;
/*
 	Stack
 	 	1. Coordinates(������ ��ǥ�� �ֱ� ���� ������ ���� ��ü)�� �����ϴ� stack.
		2. �����ڿ����� �ʱ� size�� 64�� ����( n(O) = n^2(�� �� �湮�� ��ǥ�� �ٽ� ���� ����, 8 X 8 = 64).
 		3. push�޼ҵ�� Coordinates�ν��Ͻ��� �Է¹޾� stack�� ����.
 		4. pop�޼ҵ�� ���� ����� ������ �� ���� ���� �����͸� ��ȯ��.
 			stack��  empty�� ��� null�� ��ȯ.
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

