package Basic;

public class Split_method {
public static void main(String[] args) {
	
	
	String s1="22-07-2010";
	
	String w[]=s1.split("-");
	System.out.println(w); 
	for(String ss: w) {
		
		System.out.println(ss);
		
	}
	
String ss=s1.substring(8,10);
System.out.println(ss);
}
}
