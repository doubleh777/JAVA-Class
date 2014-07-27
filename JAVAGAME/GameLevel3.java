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
		System.out.println("level 3 simple attack : 메롱~ 메롱~ 메롱");
	}

	@Override
	public void turnAttack() {
		System.out.println("level 3 turn attack : 뒤돌려차기 앞돌려차기");
	}

	@Override
	public void flyingAttack() {
		System.out.println("level 3 flying attack : 날라차기 휙~~~");
	}

	@Override
	public GameLevel upgradeLevel() {
		System.out.println("레벨 3이 만랩입니다. 더 이상 레벨업 할 수 없습니다.");
		return this;
	}

}
