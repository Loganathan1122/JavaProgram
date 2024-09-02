package OverLoading;



public class InternsDetails {
	
	private void interns(String name,String first_name,float mark) {
		System.out.println("customar name"+ name);
		System.out.println("the first name is :" + first_name);
		System.out.println("mark is "+mark);
		

	}
private void interns(int phone , String username) {
	System.out.println("customar phone no" + phone);
		System.out.println("user name is "+ username);

	}
private void interns(float salary) {
	System.out.println("salary is :" + salary );

	
}
public static void main(String[] args) {
	InternsDetails obj = new InternsDetails(); 
	obj.interns("loganathan", "loga", 30f);
	obj.interns(1000f);
	obj.interns(9028929,"ajay");
	
	
}

}
