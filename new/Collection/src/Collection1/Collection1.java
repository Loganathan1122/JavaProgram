package Collection1;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {
	
	public static void main(String[] args) {
		List l = new ArrayList();
		
		l.add(0,100);
		l.add(200);
		l.add(300);
		l.add(1, 20);
		l.add(1, 50);
		l.add(1, 50);
		l.add(1, 50);
		l.add(1, 50);
		l.add(null);
		l.add(null);
		l.add("loganathan:");
		
		l.set(1, 150);
	
		System.out.println(	l.get(2));
		
		List l1 = new ArrayList();
		l.add(0,100);
		l.add(200);
		l.add(300);
		l.add(1, 20);
		l.addAll(0, l1);
		System.out.println(l);
		l.addLast(20);
		System.out.println(l.listIterator(2));
		
		
	}
	
	

}
