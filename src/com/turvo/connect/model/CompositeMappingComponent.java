package com.turvo.connect.model;

/**
 * Created by srinivas.g on 23/11/17.
 */
public class CompositeMappingComponent {
    private String publisherId; //unique id for publisher
    private String pubEntity;  //publisher's primary entity
    private String pubEntityId; //publisher's primary entity id
    private String subscriberId; //subscriber's unique id
    private String subEntity; //subscriber's primary entity
    private String subEntityId; //subscriber's primary entity id

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getPubEntity() {
        return pubEntity;
    }

    public void setPubEntity(String pubEntity) {
        this.pubEntity = pubEntity;
    }

    public String getPubEntityId() {
        return pubEntityId;
    }

    public void setPubEntityId(String pubEntityId) {
        this.pubEntityId = pubEntityId;
    }

    public String getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubEntity() {
        return subEntity;
    }

    public void setSubEntity(String subEntity) {
        this.subEntity = subEntity;
    }

    public String getSubEntityId() {
        return subEntityId;
    }

    public void setSubEntityId(String subEntityId) {
        this.subEntityId = subEntityId;
    }

    @Override
    public String toString() {
        return "CompositeMappingComponent{" +
                "publisherId='" + publisherId + '\'' +
                ", pubEntity='" + pubEntity + '\'' +
                ", pubEntityId='" + pubEntityId + '\'' +
                ", subscriberId='" + subscriberId + '\'' +
                ", subEntity='" + subEntity + '\'' +
                ", subEntityId='" + subEntityId + '\'' +
                '}';
    }
}
