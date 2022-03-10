 package com.poly.sample;

public class Sample {
	public void name(String N) {
		System.out.println("the name is : " + N);
	}
public void number(int num) {
	System.out.println("the number is "+num);
	
}
public void details(String N, int num, char c) {
	System.out.println("name is " + N + " ID is " +num + " initial is " + c);
}


public static void main(String[] args) {
	Sample S = new Sample();
	S.name("Keerthi");
	S.number(14);
	S.details("keerthi.", 14, 'A');
}
}
