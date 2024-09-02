package Office;

public class Branch2 extends Branch1 {
	
	private void madras() {
		System.out.println("this is madras");
	}

	public static void main(String[] args) {
		Branch2 yy = new Branch2();
		yy.madras(); // branch 2
		yy.chennai(); // branch 1
		yy.alapuzha(); // branch
	}
}
