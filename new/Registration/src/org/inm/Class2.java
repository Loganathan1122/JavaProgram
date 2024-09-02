package org.inm;

public class Class2 {

private void internName1() {
		
		System.out.println("LOganathan");
		
	}
	
	private void internDob1() {
		System.out.println("10-10-10");
		
	}
	
	private void internPhone1() {
		System.out.println("8328382328");
	}
	
	public static void main(String[] args) {
		
		//class name obj_name = new class name ();
		
		InternDetails pkg = new InternDetails();
		
		pkg.internName1();
		pkg.internDob1();
		pkg.internPhone1();
	}
}
