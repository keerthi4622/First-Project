package com.car.details;

public class benz implements carDetails  {

	@Override
	public void model() {
	System.out.println("A Class Benz");		
	}

	@Override
	public void price() {
	System.out.println("Benz price: 40 Lakhs");
		
	}

	@Override
	public void type() {
	System.out.println("Benz type: Sedan");
		
	}
	public static void main(String[] args) {
		benz b = new benz();
		b.model();
		b.price();
		b.type();
	}
}

