package com.turvo.connect.model;

import java.util.List;
import java.util.Map;

public class LineageResponse {
	private boolean success;
	private int statusCode;
	private String message;
	private List<Map<String, Object>> data;
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Map<String, Object>> getData() {
		return data;
	}
	public void setData(List<Map<String, Object>> data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "LineageResponse [success=" + success + ", statusCode=" + statusCode + ", message=" + message + ", data="
				+ data + "]";
	}
	
}
