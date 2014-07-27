package game;

public abstract class GameLevel {
	
	public GameLevel lv = this;
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	public abstract GameLevel upgradeLevel();
	
	public final void play()
	{
		simpleAttack();
		turnAttack();
		flyingAttack();
	}

	
	
}
