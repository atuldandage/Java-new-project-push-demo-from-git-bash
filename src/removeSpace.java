
public class removeSpace {
public static void main(String[] args) {

	String s="java by kiran";
	int countspace=0;
	StringBuilder newstring=new StringBuilder();
	
char[] storechar=	s.toCharArray();
	//System.out.println(storechar);

for (char c : storechar) {
	
	if(c!= ' ') { 
		newstring.append(c);
		
		}
	else {
		countspace++;
	}
}
System.out.println(countspace);
System.out.println(newstring);
}
}
