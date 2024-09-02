import java.util.Scanner;

public class Task2 {

	
	public static void main(String[] args) {
		Scanner xx= new Scanner(System.in);
		
		System.out.println("Eneter ur Number");
		int num = xx.nextInt();
		
		if(num %2==0 )
		{
			System.out.println("ur number is even");
		}
		
		else
		{
			System.out.println("ur number is odd number");
		}
		
	}
}
