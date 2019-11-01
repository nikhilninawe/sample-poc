package com.turvo.connect.model;

public class CarrierOrder {
	private Cost costs;
	private int carrier_order_id;
	
	public Cost getCosts() {
		return costs;
	}
	public void setCosts(Cost costs) {
		this.costs = costs;
	}
	public int getCarrier_order_id() {
		return carrier_order_id;
	}
	public void setCarrier_order_id(int carrier_order_id) {
		this.carrier_order_id = carrier_order_id;
	}
}
