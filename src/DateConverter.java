import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateConverter {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-M-yyyy");
		String dateinString="08-4-2022";
		
		Date date=sdf.parse(dateinString);
		System.out.println(date);
	Calendar cal=	Calendar.getInstance();
		cal.setTime(date);
		
	}

}
