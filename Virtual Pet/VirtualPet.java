package U3A5;

import U3A5.Food;
import U3A5.Game;

public class VirtualPet {
	private String name;
	private int energy;
	private int happiness;
	private int weight;
	private int age;
	private int months;
	private boolean sick;
	
	public VirtualPet(String str) {
		name = str;
		weight = 5;
		happiness = 5;
		energy = 5;
	}
	
	public String getName() {
		return name;
	}
	
	public void isSick() {
		if (((int) Math.random()*100 + 1) > 70) sick = true; else sick = false;
	}
	
	public void reverseSick() {
		sick = !sick;
	}
	
	public boolean getSick() {
		return sick;
	}
	
	public String toString() {
		return "\nName: "+name + "\nEnergy Level: "+energy + "\nHappiness Level: "+happiness + "\nWeight: "+weight + "\nAge: "+age+" years "+months+" months"+"\nSick: "+sick+"\n";
	}
	
	public void feed(Food f) {
		if ((energy += f.getEnergyRating())>=10){
			energy = 10;
		}
		else
			energy += f.getEnergyRating();
		
		weight += f.getWeight();
		if (energy<10)
			energy++;
		weight++;
	}
	
	public int getEnergyLevel() {
		return energy;
	}
	
	public int getHappinessLevel() {
		return happiness;
	}
	
	public boolean play(Game g) {
		if ((happiness += g.getHappinessLevel())>=10)
		 	happiness = 10;
		else
			happiness += g.getHappinessLevel();
		if ((weight += g.getWeight())<=5)
			weight = 5;
		else
			weight += g.getWeight();
		if(g.isWinner()) {
			if (happiness<10)
				happiness++;
			if (weight>5)
				weight--;
			return true;
		}
		else {
			happiness--;
			return false;
		}
	}
	

	
	public void updateStatus() {
		if (happiness>0)
			happiness--;
		if (energy>0)
			energy--;
		months++;
		if (months/12 == 1) {
			months %= 12;
			age++;
		}
		if (sick) {
			if (energy>0)
				energy--;
			if (happiness>0)
				happiness--;
		}
	}

}

