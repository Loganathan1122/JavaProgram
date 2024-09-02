package woking;



import java.util.Scanner;  // Importing the Scanner class from java.util package

public class Sample {
	
	
    public static void main(String[] args) {
    	
    	int red =100;
    	int blue= 200;
    	int white =300;
    	int amt=0;
    	
        Scanner sc = new Scanner(System.in);  // Creating a Scanner object
        System.out.println("enter ur amount");
        
int amts = sc.nextInt();
System.out.println("ur amt is "+ amts);

//if(amt<=100)
//{
//	System.out.println("red");
//}
//
//if (amt<=200) {
//	System.out.println("blue");
//}
//if(amt<=300)
//{
//	System.out.println("white");
//}
//
//else {
//	System.out.println("wrong");
//}

sc.close(); 
}
}