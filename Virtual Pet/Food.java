package U3A5;

public class Food {
	
	private String foodName;
	private int energy;
	private int happiness;
	private int weight;
	
	public Food(String name, int energyIncrease, int happinessIncrease, int weightGain) {
		foodName=name;
		energy+=energyIncrease;
		happiness+=happinessIncrease;
		weight+=weightGain;
	}
	
	public String getFoodName() {
		return foodName;
	}
	
	public int getEnergyRating() {
		return energy;
	}
	
	public int getHappinessRating() {
		return happiness;
	}
	
	public int getWeight() {
		return weight;
	}
	
}

