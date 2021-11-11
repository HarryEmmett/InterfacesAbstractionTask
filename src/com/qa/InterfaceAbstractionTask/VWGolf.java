package com.qa.InterfaceAbstractionTask;

public class VWGolf implements CarParts, MOT, Price {

	@Override
	public void wheels() {
		System.out.println("Has 4 wheels.");
	}

	@Override
	public void doors() {

		System.out.println("Has 3 doors.");
	}

	@Override
	public void automatic() {

		System.out.println("Automatic: " + true);
	}

	@Override
	public void price() {
		System.out.print("Price: ");
		System.out.println(15999);

	}

	@Override
	public void paymentPlan() {
		System.out.print("Payment plan available: ");
		System.out.println(true);

	}

	@Override
	public void warranty() {
		System.out.print("Warranty included: ");
		System.out.print(true);

	}

	@Override
	public void MOTrenewal() {
		System.out.print("MOT renewal: ");
		System.out.println("02/2024");

	}

	@Override
	public void MOTprice() {
		System.out.print("MOT price: ");
		System.out.println("£50");

	}

	@Override
	public void MOTindate() {
		System.out.print("MOT indate: ");
		System.out.println(true);

	}

}
