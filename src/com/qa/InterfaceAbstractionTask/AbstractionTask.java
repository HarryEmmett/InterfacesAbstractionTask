package com.qa.InterfaceAbstractionTask;

public abstract class AbstractionTask {

	// Birds info, would be named public abstract class birds
	public abstract void makeNoise();

	public abstract void canFly();

	public abstract void birdType();

	public void wingAmount() {
		System.out.println("Has " + 2 + " wings");
	}

	public void location() {
		System.out.println("Located on Earth");
	}

}
