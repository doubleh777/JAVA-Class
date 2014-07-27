package game;

public class Player {
	private GameLevel lv;
	
	public Player(){
		lv = GameLevel1.getInstance();
	}
	
	public void upgradeLevel(){
		lv = lv.upgradeLevel();
	}
	
	public void attack(){
		lv.play();
	}
	
	public GameLevel getGameLevel(){
		return lv;
	}

}
