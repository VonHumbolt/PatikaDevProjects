package BoksMaci;

import java.util.Random;

public class Fighter {
	
	String name;
	int damage;
	int health;
	int weight;
	double doge;
	
	public Fighter(String name, int damage, int health, int weight, double doge) {
		super();
		this.name = name;
		this.health = health;
		this.damage = damage;
		this.weight = weight;
		this.doge = doge;
	}
	
	int hit(Fighter foe) {
		if (foe.isDoge()) {
			System.out.println("Saldýrý bloklandý!");
			return foe.health;
		}
		
		if (foe.health - this.damage < 0) 
			return 0;
		
		return foe.health - this.damage;
	}
	
	boolean isDoge() {
		int randomNumber = new Random().nextInt();
		
		return randomNumber <= this.doge;
	}
}
