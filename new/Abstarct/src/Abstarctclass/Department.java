package Abstarctclass;

public class Department  extends Employee {
	
	public void departmentName() {
		System.out.println("mca dept");

	}
	
	@Override
	public void employeeName() {
		System.out.println("sachin");
	}
	
		@Override
		public void employeeDesignation() {
			System.out.println("team lead");
		}
		

public static void main(String[] args) {
	Employee xx = new Department();

	xx.employeeDesignation();
	xx.employeeName();
	
}
}
