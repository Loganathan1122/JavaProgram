package woking;

import java.util.Scanner;

public class Sample4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		double number = sc.nextDouble();
		if (number > 0) {
		System.out.println("this is loganathan files .");
		}
		else if (number < 0) {
		System.out.println("The number also postive.");
		}
		else {
		System.out.println("The number is not zero.");
		}
		
		}
}
