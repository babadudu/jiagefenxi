package utils;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import data.Stock;

/**
 * This shall download from sources 
 * 
 * @author mihou
 *
 */
public class Downloader {
	
	public static void refreshAll() {
		List<Stock> stocks = new ArrayList<Stock>();
		
		for (Stock stock : stocks) {
			refreshData(stock);
		}
		
	}
	private static void connectToService()
	{
		//connect to  finance site and get data
		
	}
	
	public static void refreshData(Stock stock) {
		//find last modified date, 
		//read in new
		
		//1. determine if any existing data
		
		//2. added in new data to stock
			//from last modified to now
		if (stock.getLastModified() != null) {
			
			
			
		}
	
		//if current data > stock.getHistoricHigh, replace
		
		//3. store
		
	}

	public static Date getLastRecordedDate(Stock stock) {

		return null;
	}

	/**
	 * sn = TICKER
	 * a = fromMonth-1
	 * b = fromDay (two digits)
	 * c = fromYear
	 * d = toMonth-1
	 * e = toDay (two digits)
	 * f = toYear
	 * g = d for day, m for month, y for yearly
	 */
	private static void getDataFromYahoo(Stock stock, Date fromDate, Date toDate) {
	//http://real-chart.finance.yahoo.com/table.csv?s=YHOO&a=3&b=12&c=1996&d=6&e=5&f=2015

		try {
			URL url = new URL("http://real-chart.finance.yahoo.com/table.csv?s=" + stock.getSymbol() + "&a=" + a + "&b=" + b + "&c=" + c + " &d=" + d + "&e=" + e + "&f=" +f);

			FileUtils.copyURLToFile(url, File);

		} catch (Exception e) {
			System.out.println("Unable to download file");
		}

	}


	public static void main(String[] args) {

		Stock s = new Stock();
		s.setSymbol("YAHOO");

//		Downloader.getDataFromYahoo(s, );

	}

}
