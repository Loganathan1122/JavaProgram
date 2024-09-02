package woking;

import java.util.Iterator;
import java.util.Scanner;

public class Pcsner {
	
	
	public static void main(String[] args) {
		
		
		Scanner cc= new Scanner(System.in);
		System.out.println("what is ur name");
		
	 cc.next();
	
	System.out.println("how many time need to print ur name");
	
	int print = cc.nextInt();
	
	int i = 1;
	while (i <= print) {
	    System.out.println(cc);
	    i++;
	   
	}

	System.out.println("ur name is "+cc);
	System.out.println("yes ur name is printed for"+ print);
	System.out.println("again need to print ur name yes/no");
	
//	String yes;
//	String no;
	String yes = cc.next();
	System.out.println("how many time need to print ur name" + yes);
	
	String no = cc.next();
	//System.out.println("thank you" );
	if(yes==yes) {
		System.out.println("printing...");
	}
	
	else
	{
		System.out.println("exit");
	}
			
	

	

	

	
	
	
		
		
}
}