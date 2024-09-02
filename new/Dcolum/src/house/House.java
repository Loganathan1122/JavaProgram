package house;

public class House {
	
	private void room1(){
		System.out.println("this is bedroom");
		
	}
	
	
	
	private void room2() {
		System.out.println("this is kitchen");
	}
	
	public static void main(String[] args) {
		
		// classname obj_name = new class name(); // create object
		
		House obj = new House();
		
		obj.room1();
		obj.room2();
		
	
		
		
		
	}

}
