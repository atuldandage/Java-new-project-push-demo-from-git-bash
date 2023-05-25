package Basic;

public class interview {

	public static void main(String[] args) {
		
		
		String s1="javabykiran";
		System.out.println(s1.substring(0, 4));
		
		System.out.println(s1.substring(4));
		
		
		String s2="this is index of example"; 
	
		int index1=s2.indexOf("is");//returns the index of is substring
		   
		int index2=s2.indexOf("index");
		
		System.out.println(index1+" "+index2);//2 8 //
		System.out.println(s2.indexOf("of"));
		
		int index3=s2.indexOf("is");
		
		System.out.println(index3);
	int index_of_this=	s2.indexOf("this");
		System.out.println(index_of_this);
		
		System.out.println(s2.substring(3));
		
	}
	
	
}
