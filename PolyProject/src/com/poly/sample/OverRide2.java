package com.poly.sample;

public class OverRide2 extends OverRiding {
	@Override
	public void bankName(String b) {
	super.bankName("Axis Bank");
	System.out.println("My bank name is : " + b);
	
	}
	
	public static void main(String[] args) {
		OverRide2 or2 = new OverRide2();
		or2.bankName("Union Bank");
	}
}