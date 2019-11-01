package com.turvo.connect.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.beans.Transient;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

/**
 * PublisherParams
 * 
 * @author sandeepreddy
 * 
 **/

public class PublisherParams {
	private static final Logger logger = LogManager.getLogger(PublisherParams.class);

	private String id;
	
	private List<Integer> publisherIds;
	
	private String publisherTenantId;
		
	private String appId;

	private List<SubscriptionIO> subscriptionEntites;
	
	private String entity;
	
	private String topic;
	
	private Map<String, Object> payload;
	
	private String subscriberTenantId;
	
	private String subscriptionId;

	private Set<Integer> externalSystemIds;
	
	private byte operation;
	
	private String modifiedPayload;
	
	private String transformedPayload;
	
	private Boolean provisionRequest;
	
	private String profile;
	
	private String custId;
	
	private Map<String,String> queryParams = new LinkedHashMap<String,String>();
	
	private String primaryEntityId;
	
	private String sourcePrimaryEntityId;
	
	private String transformationId;
	
	private String dispatcherBean;
	
	private boolean previousReqFailed;
	
	private boolean currentRequestSuccessful;

	private List<String> linkedIds;
	
	private Map<String, String> headerMap;
	
	private List<String> inputSpecificLinkedIds;

	private Map<String, Object> publisherMetadata;

	public PublisherParams() {
		super();
	}
	public PublisherParams(PublisherParams params) {
		super();
		try {
			this.appId = params.getAppId();
			this.currentRequestSuccessful = params.getCurrentRequestSuccessful();
			this.custId = params.custId;
			this.dispatcherBean = params.getDispatcherBean();
			this.entity = params.getEntity();
			this.headerMap = params.getHeaderMap();
			this.id = params.getId();
			this.inputSpecificLinkedIds = params.getInputSpecificLinkedIds();
			this.linkedIds = params.getLinkedIds();
			this.modifiedPayload = params.getModifiedPayload();
			this.operation = params.getOperation();
			this.payload = params.getPayload();
			this.previousReqFailed = params.getPreviousReqFailed();
			this.primaryEntityId = params.getPrimaryEntityId();
			this.profile = params.getProfile();
			this.provisionRequest = params.getProvisionRequest();
			this.publisherIds = params.getPublisherIds();
			this.publisherMetadata = params.getPublisherMetadata();
			this.publisherTenantId = params.getPublisherTenantId();
			this.queryParams = params.getQueryParams();
			this.sourcePrimaryEntityId = params.getSourcePrimaryEntityId();
			this.subscriberTenantId = params.getSubscriberTenantId();
			this.subscriptionEntites = params.getSubscriptionEntites();
			this.subscriptionId = params.getSubscriptionId();
			this.topic = params.getTopic();
			this.transformationId = params.getTransformationId();
			this.transformedPayload = params.getTransformedPayload();
			this.externalSystemIds = params.getExternalSystemIds();
		}
		catch(Exception ex) {
			logger.info("copy constructor failure" + ex);
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public byte getOperation() {
		return operation;
	}

	public void setOperation(byte operation) {
		this.operation = operation;
	}

	public String getPublisherTenantId() {
		return publisherTenantId;
	}

	public void setPublisherTenantId(String publisherTenantId) {
		this.publisherTenantId =  publisherTenantId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Map<String, Object> getPayload() {
		return payload;
	}

	public void setPayload(Map<String, Object> object) {
		this.payload = object;
	}

	public String getModifiedPayload() {
		return modifiedPayload;
	}

	public void setModifiedPayload(String modifiedPayload) {
		this.modifiedPayload = modifiedPayload;
	}

	public String getSubscriptionId() {
		return subscriptionId;
	}

	public void setSubscriptionId(String subscriptionId) {
		this.subscriptionId = subscriptionId;
	}

	public String getSubscriberTenantId() {
		return subscriberTenantId;
	}

	public void setSubscriberTenantId(String subscriberTenantId) {
		this.subscriberTenantId = subscriberTenantId;
	}

	public Boolean getProvisionRequest() {
		return provisionRequest;
	}

    public void setProvisionRequest(Boolean provisionRequest) {
		this.provisionRequest = provisionRequest;
	}

	public List<SubscriptionIO> getSubscriptionEntites() {
		return subscriptionEntites;
	}

	public void setSubscriptionEntites(List<SubscriptionIO> subscriptionEntites) {
		this.subscriptionEntites = subscriptionEntites;
	}

	/**
	 * @return the transformedPayload
	 */
	public String getTransformedPayload() {
		return transformedPayload;
	}

	/**
	 * @param transformedPayload the transformedPayload to set
	 */
	public void setTransformedPayload(String transformedPayload) {
		this.transformedPayload = transformedPayload;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * @return the custId
	 */
	public String getCustId() {
		return custId;
	}

	/**
	 * @param custId the custId to set
	 */
	public void setCustId(String custId) {
		this.custId = custId;
	}

	/**
	 * @return the primaryEntityId
	 */
	public String getPrimaryEntityId() {
		return primaryEntityId;
	}

	/**
	 * @param primaryEntityId the primaryEntityId to set
	 */
	public void setPrimaryEntityId(String primaryEntityId) {
		this.primaryEntityId = primaryEntityId;
	}

	/**
	 * @return the queryParams
	 */
	public Map<String, String> getQueryParams() {
		return queryParams;
	}

	/**
	 * @param queryParams the queryParams to set
	 */
	public void setQueryParams(LinkedHashMap<String, String> queryParams) {
		this.queryParams = queryParams;
	}

	/**
	 * @return the transformationId
	 */
	public String getTransformationId() {
		return transformationId;
	}

	/**
	 * @param transformationId the transformationId to set
	 */
	public void setTransformationId(String transformationId) {
		this.transformationId = transformationId;
	}

	/**
	 * @return the dispatcherBean
	 */
	public String getDispatcherBean() {
		return dispatcherBean;
	}

	/**
	 * @param dispatcherBean the dispatcherBean to set
	 */
	public void setDispatcherBean(String dispatcherBean) {
		this.dispatcherBean = dispatcherBean;
	}


	@Transient
	@JsonIgnore
	public Optional<SubscriptionIO> currentSubscription() {
		if (subscriptionEntites != null && !subscriptionEntites.isEmpty()) {
			return subscriptionEntites.stream().filter((s) -> s.getId() == Integer.parseInt(subscriptionId)).findFirst();
		}
		return Optional.empty();
	}

	public Boolean getPreviousReqFailed() {
		return previousReqFailed;
	}

	public void setPreviousReqFailed(Boolean previousReqFailed) {
		this.previousReqFailed = previousReqFailed;
	}

	public Boolean getCurrentRequestSuccessful() {
		return currentRequestSuccessful;
	}

	public void setCurrentRequestSuccessful(Boolean currentRequestSuccessful) {
		this.currentRequestSuccessful = currentRequestSuccessful;
	}
	public List<Integer> getPublisherIds() {
		return publisherIds;
	}

	public void setPublisherIds(List<Integer> publisherIds) {
		this.publisherIds = publisherIds;
	}

	/**
	 * @return the headerMap
	 */
	public Map<String, String> getHeaderMap() {
		return headerMap;
	}

	/**
	 * @param headerMap the headerMap to set
	 */
	public void setHeaderMap(Map<String, String> headerMap) {
		this.headerMap = headerMap;
	}
	
	public Map<String, Object> getPublisherMetadata() {
		return publisherMetadata;
	}

	public void setPublisherMetadata(Map<String, Object> publisherMetadata) {
		this.publisherMetadata = publisherMetadata;
	}

	/**
	 * @return the sourcePrimaryEntityId
	 */
	public String getSourcePrimaryEntityId() {
		return sourcePrimaryEntityId;
	}

	/**
	 * @param sourcePrimaryEntityId the sourcePrimaryEntityId to set
	 */
	public void setSourcePrimaryEntityId(String sourcePrimaryEntityId) {
		this.sourcePrimaryEntityId = sourcePrimaryEntityId;
	}

	public List<String> getLinkedIds() {
		return linkedIds;
	}

	public void setLinkedIds(List<String> linkedIds) {
		this.linkedIds = linkedIds;
	}

	public List<String> getInputSpecificLinkedIds() {
		return inputSpecificLinkedIds;
	}

	public void setInputSpecificLinkedIds(List<String> inputSpecificLinkedIds) {
		this.inputSpecificLinkedIds = inputSpecificLinkedIds;
	}

    public Set<Integer> getExternalSystemIds() {return externalSystemIds; }

    public void setExternalSystemIds(Set<Integer> externalSystemIds) {this.externalSystemIds = externalSystemIds; }

    @Override
	public String toString() {
		return "PublisherParams [id=" + id + ", publisherIds=" + publisherIds + ", publisherTenantId="
				+ subscriptionEntites + ", entity=" + entity + ", topic=" + topic + ", payload=" + payload
				+ ", subscriberTenantId=" + subscriberTenantId + ", subscriptionId=" + subscriptionId + ", operation="
				+ operation + ", modifiedPayload=" + modifiedPayload + ", transformedPayload=" + transformedPayload
				+ ", provisionRequest=" + provisionRequest + ", profile=" + profile + ", custId=" + custId
				+ ", queryParams=" + queryParams + ", primaryEntityId=" + primaryEntityId + ", sourcePrimaryEntityId="
				+ sourcePrimaryEntityId + ", transformationId=" + transformationId + ", dispatcherBean="
				+ dispatcherBean + ", previousReqFailed=" + previousReqFailed + ", currentRequestSuccessful="
				+ currentRequestSuccessful + ", linkedIds=" + linkedIds + ", headerMap=" + headerMap
				+ ", inputSpecificLinkedIds=" + inputSpecificLinkedIds + ", publisherMetadata=" + publisherMetadata + "," +
				" externalSystemIds=" + externalSystemIds + "]";

	}
}
