package com.turvo.connect.model;

public class SubscriptionIO {

	private int id;
	
	private String pubBusId;
	
	private String subBusId;
	
	private int subscriberId;
	
	private int publisherId;
	
	private int pubExterntalSystemId;
	
	private int subExterntalSystemId;

	private String subscriptionType;

	private String endpointType;

	private String endpoint;

	private String dispatcherBean;
	
	private Integer transformationId;

	private String linkedId;

	private String additionalAuthParams;

	public String getPubBusId() {
		return pubBusId;
	}

	public void setPubBusId(String pubBusId) {
		this.pubBusId = pubBusId;
	}

	public String getSubBusId() {
		return subBusId;
	}

	public void setSubBusId(String subBusId) {
		this.subBusId = subBusId;
	}

	public int getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(int subscriberId) {
		this.subscriberId = subscriberId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubscriptionType() {
		return subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}

	public void setEndpointType(String endpointType) {
		this.endpointType = endpointType;
	}

	public String getEndpointType() {
		return endpointType;
	}

	public String getEndpoint() {
		return endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
	}

	public String getDispatcherBean() {
		return dispatcherBean;
	}

	public SubscriptionIO setDispatcherBean(String dispatcherBean) {
		this.dispatcherBean = dispatcherBean;
		return this;
	}

	/**
	 * @return the linkedId
	 */
	public String getLinkedId() {
		return linkedId;
	}

	/**
	 * @param linkedId the linkedId to set
	 */
	public void setLinkedId(String linkedId) {
		this.linkedId = linkedId;
	}

	public int getPublisherId() {
		return publisherId;
	}

	public void setPublisherId(int publisherId) {
		this.publisherId = publisherId;
	}

	public int getSubExterntalSystemId() {
		return subExterntalSystemId;
	}

	public void setSubExterntalSystemId(int subExterntalSystemId) {
		this.subExterntalSystemId = subExterntalSystemId;
	}

	public int getPubExterntalSystemId() {
		return pubExterntalSystemId;
	}

	public void setPubExterntalSystemId(int pubExterntalSystemId) {
		this.pubExterntalSystemId = pubExterntalSystemId;
	}

	/**
	 * @return the transformationId
	 */
	public Integer getTransformationId() {
		return transformationId;
	}

	/**
	 * @param transformationId the transformationId to set
	 */
	public void setTransformationId(Integer transformationId) {
		this.transformationId = transformationId;
	}

	public String getAdditionalAuthParams() {
		return additionalAuthParams;
	}

	public void setAdditionalAuthParams(String additionalAuthParams) {
		this.additionalAuthParams = additionalAuthParams;
	}
}
