package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataConverter {

	public static void csvToRange() {
		
	}
	
	public static Date getDate(String dateString) throws ParseException {
		//Jul 2, 2015
		DateFormat dateFormat = new SimpleDateFormat("MMM d, YYYY");

		Date date = dateFormat.parse(dateString);
		
		return date;
	}
}
