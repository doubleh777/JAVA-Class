package game;

public class GameLevel3 extends GameLevel{
	
	private static GameLevel3 lv3 = new GameLevel3();
	
	private GameLevel3(){
		System.out.println("======== level 3 start ========");
	}
	
	public static GameLevel3 getInstance(){
				if(lv3 == null)
					lv3 = new GameLevel3();
				
				return lv3;
			}
	@Override
	public void simpleAttack() {
		System.out.println("level 3 simple attack : �޷�~ �޷�~ �޷�");
	}

	@Override
	public void turnAttack() {
		System.out.println("level 3 turn attack : �ڵ������� �յ�������");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level 3 flying attack : �������� ��~~~");
	}

	@Override
	public GameLevel upgradeLevel() {
		System.out.println("���� 3�� �����Դϴ�. �� �̻� ������ �� �� �����ϴ�.");
		return this;
	}

}
