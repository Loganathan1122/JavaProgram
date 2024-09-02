package woking;

import java.util.Scanner;

public class samp  {

	public static void main(String[] args) {
		
		Scanner xx = new Scanner(System.in);
		
		int Arr[] = new int[5];
		
		for(int i=0;i<5;i++)

		{
			System.out.println("eneter ur array");
			  Arr[i]=xx.nextInt();
				
		}
		
		for(int i: Arr)
		{
			System.out.println(i);
		}
		
		System.out.println(Arr[2]);
		
		
	}
	
		
		
	}

