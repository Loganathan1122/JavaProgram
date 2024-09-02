package Abstarctclass;

public class ApiTesting implements Automation , Manual {
	
	private void RestAssured() {
		System.out.println("rest asured");

	}
	
	
	public void Framework() {
		System.out.println("framework done");
	}


	public void TestCase() {
	System.out.println(" testcase done");
		
	}
	public static void main(String[] args) {
		ApiTesting obj2 = new ApiTesting();
		obj2.RestAssured();
		obj2.TestCase();
		obj2.Framework();
		
	}
}
