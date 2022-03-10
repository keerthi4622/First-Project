package com.poly.sample;

public class OverLoading {
	public void accountNumber(boolean b) {
		System.out.println("your acc num is : " +b);
	}
	public void accountNumber(long b) {
		System.out.println("my acc num is : "+b);

	}
	public static void main(String[] args) {
		OverLoading ol = new OverLoading();
		ol.accountNumber(98765);
		ol.accountNumber(false);
		
	}

}
