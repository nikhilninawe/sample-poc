package com.arl.saahas.api.configuration.vo;

import java.io.Serializable;


public class LookupObject implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private long businessId;
    private String category;
    private String type;
    private String key;
    private String value;
    // carries system attributes
    private String attributes;
    private String dataType;
    private int sortOrder;
    // carries config attributes
    private String configAttributes;
    private boolean isDefault;

    public boolean isDefault() {
        return isDefault;
    }

    public void setDefault(boolean isDefault) {
        this.isDefault = isDefault;
    }

    public LookupObject(){

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public long getBusinessId() {
        return businessId;
    }
    public void setBusinessId(long businessId) {
        this.businessId = businessId;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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
    public String getAttributes() {
        return attributes;
    }

    public void setAttributes(String attributes) {
        this.attributes = attributes;
    }
    public String getDataType() {
        return dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    public int getSortOrder() {
        return sortOrder;
    }
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * @return the configAttributes
     */
    public String getConfigAttributes() {
        return configAttributes;
    }

    /**
     * @param configAttributes
     *            the configAttributes to set
     */
    public void setConfigAttributes(String configAttributes) {
        this.configAttributes = configAttributes;
    }

    @Override
    public String toString() {
        return "LookupObject{" +
                "id=" + id +
                ", businessId=" + businessId +
                ", category='" + category + '\'' +
                ", type='" + type + '\'' +
                ", key='" + key + '\'' +
                ", value='" + value + '\'' +
                ", attributes='" + attributes + '\'' +
                ", dataType='" + dataType + '\'' +
                ", sortOrder=" + sortOrder +
                ", configAttributes='" + configAttributes + '\'' +
                ", isDefault=" + isDefault +
                '}';
    }
}
