package com.turvo.connect.model;

public class SubscriptionExtAttribute {
	
	SubscriptionExtAttributeAuth auth;

	public SubscriptionExtAttributeAuth getAuth() {
		return auth;
	}

	public void setAuth(SubscriptionExtAttributeAuth auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "SubscriptionExtAttribute [auth=" + auth + "]";
	}
	
}
