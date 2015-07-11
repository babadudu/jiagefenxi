package analyzer;

import java.util.ArrayList;
import java.util.List;

import utils.Downloader;
import utils.Reporter;
import data.Stock;


/**
 * Analyze if the price of stocks exceeds historic high
 * 
 * We can start monitoring the high within the range when it's close to new high
 * We set the % to be within 5%
 *  
 * @author mihou
 *
 */
public class NewHighAnalyzer extends Analyzer {

	private static final double NEWHIGHFACTOR = 0.05 ;
	
	public static void storeNewHigh(Stock s) {
		
	}
	
	public static void findNewHighs(List<Stock> stocks) {
		
		List<Stock> newHighs = new ArrayList<Stock>();
		
		Downloader.loadData(stocks, REFRESHDATA);
		
		for (Stock s : stocks ) {
			findNewHigh(s);
			
			if (s.isBrokenNewHigh) {
				newHighs.add(s);
			}	
		}
		
		Reporter.reportNewHighs(newHighs);
	}

	private static void findNewHigh(Stock s) {

		if ( (s.getHistoricHigh() - s.getLastPrice()) / s.getHistoricHigh() < 0.05) {
			s.setBrokenNewHigh(true);

		} else {
			s.setBrokenNewHigh(false);
		}
	}
	
	
	
}
