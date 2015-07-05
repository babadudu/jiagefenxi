package enums;

import data.Stock;

public enum StockEnums {

	//store enum in datastore and modify / retrieve as needed
	
	//midcap ?
	GOOGLE("GOOGLE", "GOOG"),
	TESLA("TESLA", "TSLA");

	private Stock stockName;
	
	StockEnums(String name, String symbol) {

	}
}
