package com.qa.InterfaceAbstractionTask;

public class Runner {

	public static void main(String[] args) {

		System.out.println("================================inheritance task=============================================================");
		FordFocus f = new FordFocus();
		VWGolf v = new VWGolf();

		System.out.println("Ford Focus: ");
		f.wheels();
		f.doors();
		f.automatic();
		f.MOTindate();
		f.MOTprice();
		f.MOTrenewal();
		f.price();
		f.paymentPlan();
		f.warranty();
		System.out.println("");
		System.out.println("VW Golf: ");
		v.wheels();
		v.doors();
		v.automatic();
		v.MOTindate();
		v.MOTprice();
		v.MOTrenewal();
		v.price();
		v.paymentPlan();
		v.warranty();
		System.out.println(" ");
		System.out.println("================================inheritance task=============================================================");

		System.out.println("================================abstraction task=============================================================");
		AbstractionTaskBird m = new AbstractionTaskBird();
		m.birdType();
		m.canFly();
		m.makeNoise();
		m.wingAmount();
		m.location();
		System.out.println("================================abstraction task=============================================================");

	}

}
