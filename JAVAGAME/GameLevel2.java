package game;

public class GameLevel2 extends GameLevel{

private static GameLevel2 lv2 = new GameLevel2();

private GameLevel2(){
	System.out.println("======== level 2 start ========");
}
	
	public static GameLevel2 getInstance(){
		if(lv2 == null)
			lv2 = new GameLevel2();
			
		return lv2;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level 2 simple attack : �޷�~ �޷�~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level 2 turn attack : �������� �h~~~");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level 2 flying attack : �̰� ��������");
	}

	public GameLevel upgradeLevel(){
		System.out.println("======== levle 2 end ========");
		lv = GameLevel3.getInstance();
		return lv;
	}
}
