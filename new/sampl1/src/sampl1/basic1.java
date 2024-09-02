package sampl1;

public class basic1 extends basic {

	private void work() {
		System.out.println("somthing ofc name ");

	}
	@Override
	public void name() {
		System.out.println("vicky");
	}
	@Override
	public void phoneno() {
		System.out.println("3443434");
	}
	@Override
	public void ug() {
		// TODO Auto-generated method stub
		super.ug();
	}
	
	public static void main(String[] args) {
		basic1 bc = new basic1();
		bc.name();
		bc.phoneno();
		bc.ug();
		bc.work();
	}
}
