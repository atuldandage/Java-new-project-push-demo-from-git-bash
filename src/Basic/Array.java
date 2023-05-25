package Basic;

public class Array {
	
	
	public static void main(String[] args) {
		
		//one dimentional array printing..
		
		int a[]= {2,3,1,4};
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]); 
		}
		
		//two dimentional array...
		
		int b[][]= {{1,2,3},{3,4,5},{6,7,8,9}};
		for(int i=0;i<b.length;i++) {
		for(int j=0;j<b[i].length;j++) {
			System.out.print(b[i][j]);
			
		}
		System.out.println();	
		}

	}
}
