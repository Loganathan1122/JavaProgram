package Intrface11;

public class hous3 implements House,House1  {
	
@Override
public void rom4() {
	System.out.println("this is room6");
	
}

	
	private void room6() {
		System.out.println("this is room6");

	}
	@Override
	public void room1() {
		System.out.println("this is room1");
		
	}
	
	@Override
	public void room2() {
		System.out.println("this is room1");
		
	}
	
	@Override
	public void room3() {
		System.out.println("this is room1");
		
	}
	@Override
	public void room5() {
		System.out.println("this is room1");
		
	}
	
	
	public static void main(String[] args) {
		 hous3 obj = new hous3();
		
		 obj.room1();
		 obj.room3();
		 obj.room2();
		
		 
		
	}
	
}
