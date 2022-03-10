package NewJava;

public class StringMthds {

	public static void main(String[] args) {
		
		//ARRAY
		int[] y = new int[3] ;
		y[0] = 78;
		y[1] = 87;
		y[2] = 100;
		
		System.out.println(y[2]);
	    int z = y.length;
	    System.out.println(z);
		
	    for (int i = 0; i < y.length; i++) {
			System.out.println(y[i]);
		} 
	    
	    //if else
		int x =  5;
	    if (x <=3)
	    System.out.println("True");
	   else
	    System.out.println("False");
	    
	    //String methods
	    String a = "Keerthi Varman";
		String b = "So far so good";
		System.out.println(a+" "+b);
		
		char charAt = a.charAt(5);
		System.out.println(charAt);
		String replace = b.replace("r", "f");
		System.out.println(replace);
		String v = "";
		String concat = v.concat(a+" "+b);
		System.out.println(concat);
		int length = b.length();
		System.out.println(length);
		boolean contains = a.contains("Var");
		System.out.println(contains);
		String upperCase = b.toUpperCase();
		System.out.println(upperCase);
		boolean endsWith = a.endsWith("n");
		System.out.println(endsWith);
		int indexOf = b.indexOf("g");
		System.out.println(indexOf);
		
		String[] c = b.split(" ");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
			
		} 
		
		
		
		
}
}