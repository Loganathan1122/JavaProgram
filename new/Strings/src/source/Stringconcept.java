package source;

public class Stringconcept {

	public static void main(String[] args) {
		String s = "love";
		String s1 = "god";
		String s2 = "logan";
		
		System.out.println(s.hashCode());
		System.out.println(s.length());
		System.out.println(s.length());
		System.out.println(s.equals(s));
		System.out.println(s.equalsIgnoreCase(s));
		System.out.println(s.toUpperCase());
		System.out.println(s.concat(s2));
		System.out.println(s.compareTo(s2));
	}
}
