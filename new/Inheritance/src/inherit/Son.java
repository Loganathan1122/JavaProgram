package inherit;

public class Son extends Parents {
	
	public void sonname() {
	System.out.println("son name is loganathan");

	}
	
	public void sonage() {
		System.out.println("son age is 20");

	}
public static void main(String[] args) {
	Son obj = new Son();
	obj.name();
	obj.age();
	obj.sonage();
	obj.sonname();
	
	
}
}
