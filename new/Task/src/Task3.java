import java.util.Scanner;

public class Task3 {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter ur char");
		char ch = sc.next().charAt(0);
		
		

	        // Check if the character is a vowel or consonant using if-else
	        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
	            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
	            System.out.println(ch + " is a vowel.");
	        } else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
	            System.out.println(ch + " is a consonant.");
	        } else {
	            System.out.println(ch + " is not an alphabetic character.");
	        }
	
		
	}
}
		 
	


