package woking;

import java.util.Scanner;

public class Ars {

	
	

	public static void main(String[] args) {
		Scanner xx = new Scanner(System.in);
		
		String abc[] = new String[5];
		
		for(int i=0;i<10;i++)
		{
			System.out.println("eneter ur aaray");
			  abc[i]=xx.toString();
			  			
		}
		
	for(int i=0;i<5;i++)
	{
		System.out.println(abc[i]);
	}
		
	for(String i : abc)	
	{
		System.out.println(abc);
	}
		
	}
}
