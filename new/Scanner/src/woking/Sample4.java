package woking;

import java.util.Scanner;

public class Sample4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = sc.nextDouble();
		if (number > 0) {
		System.out.println("Theis is loganathan .");
		}
		else if (number < 0) {
		System.out.println("The number is not postive negative.");
		}
		else {
		System.out.println("The number is zero.");
		}
		
		}
}
