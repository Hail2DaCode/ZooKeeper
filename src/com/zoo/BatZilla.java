package com.zoo;

public class BatZilla extends Mammal {
	private int energyLevel = 300;
	
	public BatZilla() {
		super(300);
	}
	public int fly() {
		System.out.println("Whoosh, whoosh, Whoosh, WHOOSH");
		int energy = super.displayEnergyLevel();
		energy -= 50;
		super.setEnergyLevel(energy);
		return energy;
	}
	public int eatHumans() {
		System.out.println("AHHHH,AHHH,OOOOOOOOOOH, YEOWWWWWWWW");
		int energy = super.displayEnergyLevel();
		energy += 25;
		super.setEnergyLevel(energy);
		return energy;
	}
	public int attackTown() {
		System.out.println("ROAR, KRACKLE, SNAP, POP");
		int energy = super.displayEnergyLevel();
		energy -= 100;
		super.setEnergyLevel(energy);
		return energy;
	}
	
}
