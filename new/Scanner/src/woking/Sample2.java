/**
 * 
 */
package woking;

import java.util.Scanner;

public class Sample2 {
	

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("what is ur name");
	
	String name = sc.next();
	
	System.out.println("what is ur age");
	int age= sc.nextInt();
	System.out.println("eneter ur mobile no");
	
	long mob = sc.nextLong();
	
	System.out.println("ur name is "+ name);
	System.out.println("ur age is "+ age);
	System.out.println("ur mobile no is"+mob);
	
}
}
