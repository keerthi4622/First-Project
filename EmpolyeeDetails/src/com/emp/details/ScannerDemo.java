package com.emp.details;

import java.util.Scanner;

public class ScannerDemo {
 public static void main(String[] args) {
	Scanner sd = new Scanner(System.in);
	
	System.out.println("Enter your addess");
	String addr = sd.nextLine();
	System.out.println("Address entered is:"+ addr);
	
	System.out.println( " Enter you number");
	int num = sd.nextInt();
	System.out.println("Entered number is :"+num);
	
	System.out.println( " Enter your name");
	String sm = sd.next();
	System.out.println("Entered name is: "+sm);
	
	System.out.println( " Enter you City");
	String ad = sd.next();
	System.out.println("Entered City is : "+ ad);
}
}
