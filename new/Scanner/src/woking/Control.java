package woking;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		int first=sc.nextInt();
		
		System.out.println("enter second number");
		int second =sc.nextInt();
		
		
		
		if (first != second) {
			
			System.out.println("second is greater");
			
			
			
		}
		
		else 
		{
			System.err.println("first is greater");
		}
		
	}
	
}
