package com.turvo.connect.model;

public class HubtranWebhookRequest {
	private String custom_id;
	private String shipmentId;
	private String carrierId;
	private HubtranWebhookInvoice invoice;
	private HubtranWebhookDocument[] documents;
	private CarrierOrder[] carrier_orders;
	private boolean externalCostAdjustmentFlag;
	
	public String getCustom_id() {
		return custom_id;
	}
	public void setCustom_id(String custom_id) {
		this.custom_id = custom_id;
	}
	public String getShipmentId() {
		return shipmentId;
	}
	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}
	public String getCarrierId() {
		return carrierId;
	}
	public void setCarrierId(String carrierId) {
		this.carrierId = carrierId;
	}
	public HubtranWebhookInvoice getInvoice() {
		return invoice;
	}
	public void setInvoice(HubtranWebhookInvoice invoice) {
		this.invoice = invoice;
	}
	public HubtranWebhookDocument[] getDocuments() {
		return documents;
	}
	public void setDocuments(HubtranWebhookDocument[] documents) {
		this.documents = documents;
	}
	public CarrierOrder[] getCarrier_orders() {
		return carrier_orders;
	}
	public void setCarrier_orders(CarrierOrder[] carrier_orders) {
		this.carrier_orders = carrier_orders;
	}
	public boolean isExternalCostAdjustmentFlag() {
		return externalCostAdjustmentFlag;
	}
	public void setExternalCostAdjustmentFlag(boolean externalCostAdjustmentFlag) {
		this.externalCostAdjustmentFlag = externalCostAdjustmentFlag;
	}
}
