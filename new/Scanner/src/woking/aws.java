package woking;

import java.util.Scanner;

public class aws {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int ecw[]= new int[10];
		
		for(int i =0 ;i<10;i++)
		{
			System.out.println("eneter ur array");
			ecw[i]=sc.nextInt();
			
		}
		
		System.out.println("ur array is "+ecw[2]);
	
	
	
	for(int i:ecw)
	{
		System.out.println(i);
	}
	}
}
