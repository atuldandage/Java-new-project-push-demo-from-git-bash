import java.io.File;
import java.io.IOException;

public class demo {
public static void main(String[] args) {
	
	
	
	File obj=new File("adddd.txt");
	try {
		if(obj.createNewFile()) {
			System.out.println(obj.getName());
		}else {
			System.out.println("file already exist");
		}
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
}
}
