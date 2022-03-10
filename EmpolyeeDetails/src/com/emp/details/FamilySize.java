package com.emp.details;

public class FamilySize {
	public FamilySize() {
System.out.println("Big Family - NON Parametrised");
	}
	public FamilySize(String a) {
		System.out.println("My family is "+a);
}
	public static void main(String[] args) {
		FamilySize fs = new FamilySize();
		FamilySize fs1 = new FamilySize("BiG");
	
	}
	}

