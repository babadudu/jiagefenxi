package data;

import java.util.Date;

import com.google.gson.Gson;

public class Stock {

	String symbol;
	String fullName;
	Date lastModified;
	//current high
	double lastPrice;
	double historicHigh;
	double resistance;
	double support;
	public boolean isBrokenNewHigh;

	Range range;
	Gson data;

	public double getLastPrice() {
		return lastPrice;
	}
	public void setLastPrice(double lastPrice) {
		this.lastPrice = lastPrice;
	}
	public boolean isBrokenNewHigh() {
		return isBrokenNewHigh;
	}
	public void setBrokenNewHigh(boolean isBrokenNewHigh) {
		this.isBrokenNewHigh = isBrokenNewHigh;
	}
	public Range getRange() {
		return range;
	}
	public void setRange(Range range) {
		this.range = range;
	}
	public Gson getData() {
		return data;
	}
	public void setData(Gson data) {
		this.data = data;
	}
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	public double getHistoricHigh() {
		return historicHigh;
	}
	public void setHistoricHigh(double historicHigh) {
		this.historicHigh = historicHigh;
	}
	public double getResistance() {
		return resistance;
	}
	public void setResistance(double resistance) {
		this.resistance = resistance;
	}
	public double getSupport() {
		return support;
	}
	public void setSupport(double support) {
		this.support = support;
	}
	
	//dataStore
	//JSONObject historicData
	
}
