package woking;

public class Array {
	
	public void m1() {
		System.out.println("non static");

	}
	
	public static void m2()
	{
		System.out.println("static");
	}

	public static void main(String[] args) {
		
		Array xx = new Array();
		xx.m1();
		xx.m2();
		
	
		
		
//		int tamil[]= new int[1000];
//		
//		tamil[0]=1;
//		tamil[1]=20;
//		tamil[1]=50;
//		tamil[3]=30;
//		tamil[4]=40;
//		System.out.println(tamil[]);
		
	}
}
