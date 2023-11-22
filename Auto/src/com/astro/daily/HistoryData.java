package com.astro.daily;
public class HistoryData {
private double open = 0.0;
private double close = 0.0;
private double high = 0.0;
private double low = 0.0;
private double volume = 0.0;
private double totalBuy = 0.0;
private double totalSell = 0.0;
private double oi = 0.0;
private double changeInOi = 0.0;
private double bidQty = 0.0;
private double askQty = 0.0;
private double bidPrice = 0.0;
private double askPrice = 0.0;
private double previousClose = 0.0;
private double previousQty = 0.0;
private double qty = 0.0;

public HistoryData() {
	
	super();
}

public void setOpen(double arg) {
	this.open = arg;
}
public void setClose(double arg) {
	this.close = arg;
}
public void setHigh(double arg) {
	this.high = arg;
}
public void setLow(double arg) {
	this.low = arg;
}
public void setVolume(double arg) {
	this.volume = arg;
}
public void setTotalBuy(double arg) {
	this.totalBuy = arg;
}
public void setTotalSell(double arg) {
	this.totalSell = arg;
}
public void setOi(double arg) {
	this.oi = arg;
}
public void setChangeInOi(double arg) {
	this.changeInOi = arg;
}
public void setBidQty(double arg) {
	this.bidQty = arg;
}
public void setAskQty(double arg) {
	this.askQty = arg;
}
public void setBidPrice(double arg) {
	this.bidPrice = arg;
}
public void setAskPrice(double arg) {
	this.askPrice = arg;
}
public void setPreviousClose(double arg) {
	this.previousClose = arg;
}
public void setPreviousQty(double arg) {
	this.previousQty = arg;
}
public void setQty(double arg) {
	this.qty = arg;
}

public double getOpen() {
	return this.open;
}
public double getClose() {
	return this.close;
}
public double getHigh() {
	return this.high;
}
public double getLow() {
	return this.low;
}
public double getVolume() {
	return this.volume;
}
public double gettotalBuy() {
	return this.totalBuy;
}
public double gettotalSell() {
	return this.totalSell;
}
public double getOi() {
	return this.oi;
}
public double getChangeInOi() {
	return this.changeInOi;
}
public double getBidQty() {
	return this.bidQty;
}
public double getAskQty() {
	return this.askQty;
}
public double getbidPrice() {
	return this.bidPrice;
}
public double getAskPrice() {
	return this.askPrice;
}
public double getPreviousClose() {
	return this.previousClose;
}
public double getPreviousQty() {
	return this.previousQty;
}
public double getQty() {
	return this.qty;
}
}
