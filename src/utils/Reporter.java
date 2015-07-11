package utils;

import java.util.List;

import data.Stock;

/**
 * Responsible to report analyzed results
 * Email report for easier tracking
 * 
 * @author mihou
 *
 */
public class Reporter {
	
	private static final String FINANCESITE = "https://www.google.com/finance?q=";

	public static void reportNewHighs(List<Stock> newHighs) {
		report("Below is a list of stocks that have new Highs : ");
		for (Stock s : newHighs){
			constructStockLink(s);	
		}
		report("End of lists");
	}

	private static void constructStockLink(Stock s) {
		String result = s.getFullName() + "(" + s.getSymbol()+") :" + getLink(s.getSymbol());

		report(result);
	}

	public static void report(String s) {
		System.out.println(s);
	}
	
	public static void reports(String... strings) {
		for(String s : strings) {
			report(s);
		}
	}

	private static String getLink(String symbol) {
		return FINANCESITE+symbol;
	}


}
