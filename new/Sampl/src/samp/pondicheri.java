package samp;

public class pondicheri extends chennai {

	private void water() {
		System.out.println("water bottele rate");

	}
	 
	@Override
	public void chikon() {
		System.out.println("200");
	}
	
	@Override
	public void beer() {
		System.out.println("150");
	}
	
	@Override
	public void chips() {
		System.out.println("rs 200");
	}
	
	public static void main(String[] args) {
		pondicheri yy = new pondicheri();
		yy.beer();
		yy.chikon();
		yy.chips();
		yy.water();
		
	}
}

