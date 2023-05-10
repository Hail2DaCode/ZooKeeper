package com.zoo;

public class Gorilla extends Mammal{
	public Gorilla() {
		super();
	}
	public int throwThings() {
		int energy =  this.displayEnergyLevel();
		System.out.println("Gorilla has thrown something!");
		energy -= 5;
		this.setEnergyLevel(energy);
		return energy;
	}
	public int eatBananas( ) {
		int energy = this.displayEnergyLevel();
		energy += 10;
		System.out.println("Gorilla likes bananas.  Gorilla is satisfied!");
		this.setEnergyLevel(energy);
		return energy;
	}
	public int climb() {
		int energy = this.displayEnergyLevel();
		energy -= 10;
		System.out.println("Gorilla has climbed a tree!");
		this.setEnergyLevel(energy);
		return energy;
	}
}
