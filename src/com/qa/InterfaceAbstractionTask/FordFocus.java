package com.qa.InterfaceAbstractionTask;

public class FordFocus implements CarParts, MOT, Price {

	@Override
	public void wheels() {
		System.out.println("Has 4 wheels.");
	}

	@Override
	public void doors() {

		System.out.println("Has 5 doors.");
	}

	@Override
	public void automatic() {

		System.out.println("Automatic: " + false);
	}

	@Override
	public void price() {
		System.out.println("Price" + 10999);

	}

	@Override
	public void paymentPlan() {
		System.out.print("Payment plan available: ");
		System.out.println(false);

	}

	@Override
	public void warranty() {
		System.out.print("Warranty included: ");
		System.out.println(true);

	}

	@Override
	public void MOTrenewal() {
		System.out.print("MOT renewal: ");
		System.out.println("11/2022");

	}

	@Override
	public void MOTprice() {
		System.out.print("MOT price: ");
		System.out.println("£60");

	}

	@Override
	public void MOTindate() {
		System.out.print("MOT indate: ");
		System.out.println(true);

	}

}
