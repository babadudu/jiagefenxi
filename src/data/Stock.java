package data;

import java.util.Date;

import com.google.gson.Gson;

public class Stock {

	String symbol;
	String fullName;
	Date lastModified;
	//current high
	double historicHigh;
	double resistance;
	double support;
	
	Range range;
	Gson data;

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
