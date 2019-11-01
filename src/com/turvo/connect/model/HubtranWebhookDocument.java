package com.turvo.connect.model;

public class HubtranWebhookDocument {
	private String type;
	private String url;
	private String id;
	private String key;
	private String value;
	private HubtranWebhookDocumentStatus documentStatus;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public HubtranWebhookDocumentStatus getDocumentStatus() {
		return documentStatus;
	}
	public void setDocumentStatus(HubtranWebhookDocumentStatus documentStatus) {
		this.documentStatus = documentStatus;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
