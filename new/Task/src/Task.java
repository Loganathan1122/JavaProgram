import java.util.Scanner;

public class Task {
	
// check POstive or Negative 
	// write a program to check Whether a number is postive or negtive using if else

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ur number");
		 int num = sc.nextInt();
		
		 if(num>=0)
		 {
			 System.out.println("NUmber is Postive");
		 }
		 else
		 {
			 System.out.println("number is negative");
		 }
	}
	
}
