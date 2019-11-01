package com.turvo.connect.model;

public class SubscriptionExtAttributeAuth {
	private String clientId, clientSecret, audience, grantType, authURL;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public String getGrantType() {
		return grantType;
	}

	public void setGrantType(String grantType) {
		this.grantType = grantType;
	}

	public String getAuthURL() {
		return authURL;
	}

	public void setAuthURL(String authURL) {
		this.authURL = authURL;
	}

	@Override
	public String toString() {
		return "SubscriptionExtAttributeAuth [clientId=" + clientId + ", clientSecret=" + clientSecret + ", audience="
				+ audience + ", grantType=" + grantType + ", authURL=" + authURL + "]";
	}

}
