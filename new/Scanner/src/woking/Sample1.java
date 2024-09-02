package woking;

import java.awt.Desktop;
import java.net.URI;
import java.util.Scanner;

public class Sample1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter ur site name ");
		
		 String str = sc.toString();
		 System.out.println("ur site is loanding" + str);
		
		
		try {
	        URI uri = new URI("https://google.com");
	        Desktop.getDesktop().browse(uri);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}

	
}

