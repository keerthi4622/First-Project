package com.car.details;

public class Bmw extends benz implements carDetails {
 @Override
public void model() {
	 System.out.println("BMW 1 series");
	 super.model();
	 
}
@Override
	public void price() {
	System.out.println("BMW price: 35 Lakhs");
	super.price();
	
	}
@Override
	public void type() {
	System.out.println("BMW type: Hatchback");
	super.type();
	}
public static void main(String[] args) {
	Bmw bmw = new Bmw();
	bmw.model();
	bmw.price();
	bmw.type();
}
}

