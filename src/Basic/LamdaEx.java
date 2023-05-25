package Basic;

import java.util.ArrayList;

public class LamdaEx {

	//ArrayList<String>actmaincourselist=new ArrayList<String>();
	//listofcourses.forEach(courseName-> actmaincourselist.add(courseName.getText()));//lambda expression
	
	
	public static void main(String[] args) {
		ArrayList<String>actmaincourselist=new ArrayList<String>();
		ArrayList<String>ss=new ArrayList<String>();
		ss.add("java");
		ss.add("selenium");
		
		ss.forEach(coursename-> actmaincourselist.add(coursename));//lambda
		ss.addAll(actmaincourselist);
		
		System.out.println(actmaincourselist);
	} 
	
	
}
