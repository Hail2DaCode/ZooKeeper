package com.zoo;

public class Mammal {
	private int energyLevel = 100;
	
	public Mammal() {
		
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public int displayEnergyLevel() {
		System.out.printf("The energy level is: %d \n", energyLevel);
		return energyLevel;
	}
	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
}
