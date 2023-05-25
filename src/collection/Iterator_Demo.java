package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator_Demo {

	
	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		for (int i=0; i<=10; i++) {
		l.add(i);
		}
		System.out.println(l);
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
		Integer ss=(Integer) itr.next();
	
		System.out.println(ss);
		}
		System.out.println(l);
}
}