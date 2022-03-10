package com.poly.sample;

public class OverRiding {
	public void bankName(String b) {
	System.out.println("The bank name is : "+ b );
	}
	public static void main(String[] args) {
		OverRiding or = new OverRiding();
		or.bankName("Axis Bank");
	}
}
