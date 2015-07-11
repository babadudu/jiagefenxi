package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import data.Stock;

public class DataUtil {

	public static void csvToRange() {
		
	}
	
	public static Date getDate(String dateString) throws ParseException {
		//Jul 2, 2015
//		DateFormat dateFormat = new SimpleDateFormat("MMM d, YYYY");
		//YAHOO 2/2/07
		DateFormat dateFormat = new SimpleDateFormat("M/d/YY");

		Date date = dateFormat.parse(dateString);
		
		return date;
	}

	public static void loadData(Stock s) {
		//@TODO MEAT&BONE load from Local JSON string and convert into stock s objects
		
		
	}

	public static void loadDatas(List<Stock> stocks) {
		for(Stock s : stocks) {
			loadData(s);
		}
		
	}
}
