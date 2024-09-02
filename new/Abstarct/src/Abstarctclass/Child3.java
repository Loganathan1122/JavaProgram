package Abstarctclass;

public class Child3 extends Partents3 {
	public void work() {
		System.out.println("my work");
	}
	
	@Override
	public void study() {
		System.out.println("study completd");
		
	}
	
	
	public static void main(String[] args) {
		Child3 obj = new Child3();
		obj.marriage();
		obj.life();
		obj.work();
		obj.study();
		
		
		
		
	}

}
