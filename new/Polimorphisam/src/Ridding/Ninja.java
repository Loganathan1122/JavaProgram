package Ridding;

public class Ninja extends BMW {

	@Override
	public void mileage() {
		System.out.println("this is ninja milage");
		
		
	
	}
	
	@Override
	public void enginePower() {
		
		System.out.println("this is ninja engine");
	}
	private void price() {
		System.out.println("ninja price");
		

	}
	
	private void model() {
		System.out.println(" ninja model");
		

	}
	private void speed() {
		System.out.println("ninja speed");
		

	}
	
	
	
	public static void main(String[] args) {
		
		Ninja obj = new Ninja();
		
	obj.mileage();
		obj.enginePower();
		
		obj.model();
		obj.price();
		obj.speed();
		
	}
}
