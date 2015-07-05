package utils;

import java.util.ArrayList;
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
	
	

}
