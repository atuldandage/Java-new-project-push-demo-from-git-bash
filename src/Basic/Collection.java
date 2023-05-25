package Basic;

import java.util.ArrayList;

public class Collection {
public static void main(String[] args) {
	
	ArrayList<String> p1= new ArrayList<String>();
	
	p1.add("Selenium");
	p1.add("java");
	p1.add("python");
	System.out.println("This all from p1"+"  "+p1);
	ArrayList<String> p2=new ArrayList<String>();
	
	
	/*//by using for loop
	for(int i=0;i<p1.size();i++) {
		
		String old=p1.get(i);
		
		p2.add(old);
	
	} */
	//by using foreach loop.
	for (String string : p1) {   
		p2.add(string);
		
		
	}
	
	System.out.println(p2);
}
	
	
	
}
