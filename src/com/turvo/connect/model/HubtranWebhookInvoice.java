package com.turvo.connect.model;

public class HubtranWebhookInvoice {
    	private String number;
    	private String date;
    	private String date_to_pay;
    	private String amount_to_pay;
    	private boolean  quickpay;
    	private String payment_strategy;
    	
		public String getNumber() {
			return number;
		}
		public void setNumber(String number) {
			this.number = number;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getDate_to_pay() {
			return date_to_pay;
		}
		public void setDate_to_pay(String date_to_pay) {
			this.date_to_pay = date_to_pay;
		}
		public String getAmount_to_pay() {
			return amount_to_pay;
		}
		public void setAmount_to_pay(String amount_to_pay) {
			this.amount_to_pay = amount_to_pay;
		}
		public boolean isQuickpay() {
			return quickpay;
		}
		public void setQuickpay(boolean quickpay) {
			this.quickpay = quickpay;
		}
		public String getPayment_strategy() {
			return payment_strategy;
		}
		public void setPayment_strategy(String payment_strategy) {
			this.payment_strategy = payment_strategy;
		}
}
