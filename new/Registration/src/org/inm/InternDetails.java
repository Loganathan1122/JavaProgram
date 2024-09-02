package org.inm;

public class InternDetails {
	
	private void internName() {
		
		System.out.println("LOganathan");
		
	}
	
	private void internDob() {
		System.out.println("10-10-10");
		
	}
	
	private void internPhone() {
		System.out.println("8328382328");
	}
	
	public static void main(String[] args) {
		
		//class name obj_name = new class name ();
		
		InternDetails pkg = new InternDetails();
		
		pkg.internName();
		pkg.internDob();
		pkg.internPhone();
	}

}
