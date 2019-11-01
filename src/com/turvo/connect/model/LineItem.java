package com.turvo.connect.model;

public class LineItem {
	private Type type;
	private int qty;
	private double price;
	private double amount;
	private boolean billable;
	private int _operation;
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public boolean isBillable() {
		return billable;
	}
	public void setBillable(boolean billable) {
		this.billable = billable;
	}
	public int get_operation() {
		return _operation;
	}
	public void set_operation(int _operation) {
		this._operation = _operation;
	}
	
	
}
