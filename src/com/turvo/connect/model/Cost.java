package com.turvo.connect.model;

public class Cost {
	private LineItem[] line_items;
	private boolean recalculateCostAmount;
	
	public LineItem[] getLine_items() {
		return line_items;
	}
	public void setLine_items(LineItem[] line_items) {
		this.line_items = line_items;
	}
	public boolean isRecalculateCostAmount() {
		return recalculateCostAmount;
	}
	public void setRecalculateCostAmount(boolean recalculateCostAmount) {
		this.recalculateCostAmount = recalculateCostAmount;
	}
}
