package U3A5;

public class Game {
	
	private String gameName;
	private int happiness;
	private int weight;
	
	public Game(String name, int happinessIncr, int weightDecr) {
		gameName=name;
		happiness+=happinessIncr;
		weight-=weightDecr;
	}
	
	public boolean isWinner() {
		int a=(int)(Math.random()*2);
		if (a==1)
			return true;
		else
			return false;
	}
	
	public String getGameName() {
		return gameName;
	}
	
	public int getHappinessLevel() {
		return happiness;
	}
	
	public int getWeight() {
		return weight;
	}

}
