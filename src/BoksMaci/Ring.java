package BoksMaci;

import java.util.Random;

public class Ring {
	
	Fighter f1;
	Fighter f2;
	int minWeight;
	int maxWeight;
	boolean isFirstHit;
	
	public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
		super();
		this.f1 = f1;
		this.f2 = f2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	
		this.whoStartFight();
	}
	
	void run() {
		
	}
	
	void fight() {
		while (this.f1.health > 0 && this.f2.health > 0) {
			
			if (this.isFirstHit) {
				this.f2.health = this.f1.hit(f2);
				this.isFirstHit = false;
				
				if (this.whoIsWin()) {
					break;
				}
			} 
			else {
				this.f1.health = this.f2.hit(f1);
				this.isFirstHit = true;
				if (this.whoIsWin())
					break;
			}
			this.printScore();
		}
	}
	
	boolean whoIsWin() {
		if (this.f1.health == 0) {
			System.out.println(this.f2.name + " Kazandý! ");
			return true;
		}
		if (this.f2.health == 0) {
			System.out.println(this.f1.name + " Kazandý!");
			return true;
		}
		return false;
	}
	
	void whoStartFight() {
		
		Random random = new Random();
		int randomNumber = random.nextInt(3);
		
		if (randomNumber == 1) 
			this.isFirstHit = true;
		else
			this.isFirstHit = false;
		
	}
	
	boolean sWeightLegal() {
		return (this.f1.weight >= this.minWeight && this.f1.weight <= this.maxWeight) && (this.f2.weight >= this.minWeight && this.f2.weight <= this.maxWeight);
	}
	void printScore() {
        System.out.println("------------");
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
    }
}
