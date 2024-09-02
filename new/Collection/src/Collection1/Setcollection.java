package Collection1;

import java.util.HashSet;
import java.util.Set;

public class Setcollection {
	
	public static void main(String[] args) {
		Set s= new HashSet();
		
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(300);
		s.add(300);
		s.add(null);
		s.add(null);
		s.add("loganathan");
	
	
	s.addAll(s);
		System.out.println(s.isEmpty());
		
		System.out.println(s);
		System.out.println(s.size());
//		int size1 = s.size();
//		System.out.println(size1);
		
		
	}

}
