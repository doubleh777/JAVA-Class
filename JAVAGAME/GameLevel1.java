package game;

public class GameLevel1 extends GameLevel {
	
	private static GameLevel1 lv1 = new GameLevel1();
	private GameLevel1(){
		System.out.println("======== level 1 start ========");
	}
	
	public static GameLevel1 getInstance(){
		if(lv1 == null)
			lv1 = new GameLevel1();
			
		return lv1;
	}
	
	@Override
	public void simpleAttack() {
		System.out.println("level 1 simple attack : �޷� ~~~");
	}

	@Override
	public void turnAttack() {
		System.out.println("level 1 turn attack : ��������");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level 1 flying attack : �̰͵� ��������");
	}

	public GameLevel upgradeLevel(){
		System.out.println("======== levle 1 end ========");
		lv = GameLevel2.getInstance();
		return lv;
	}
}
