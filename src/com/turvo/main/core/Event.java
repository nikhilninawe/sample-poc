package com.turvo.main.core;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author aditya.c
 *
 * Top Level class which every concrete event type should extend from.
 * See https://turvojira.atlassian.net/browse/IN-104 for more information.
 *
 */
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "eventType",
        defaultImpl = DefaultEvent.class,
        visible = true)
@JsonSubTypes({

        @JsonSubTypes.Type(value = ShipmentStatusEvent.class, name = "SHIPMENT_STATUS_UPDATE"),
})
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private Long busId;
    private String busName;
    private String eventType = null;
    private String eventDesc = null;
    private Integer eventPriority;
    private String channel;
    private HashMap<String,Object> eventMetadata;
    private HashMap<String,Object> contextSnapshot;
    private HashMap<String,Object> eventAttributes;
    private String subType = null;

    public Long getBusId() {
        return busId;
    }
    public void setBusId(Long busId) {
        this.busId = busId;
    }
    public String getEventType() {
        return eventType;
    }
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
    public String getEventDesc() {
        return eventDesc;
    }
    public void setEventDesc(String eventDesc) {
        this.eventDesc = eventDesc;
    }
    public Integer getEventPriority() {
        return eventPriority;
    }
    public void setEventPriority(Integer eventPriority) {
        this.eventPriority = eventPriority;
    }
    public String getChannel() {
        return channel;
    }
    public void setChannel(String channel) {
        this.channel = channel;
    }
    public HashMap<String, Object> getEventMetadata() {
        return eventMetadata;
    }
    public void setEventMetadata(HashMap<String, Object> eventMetadata) {
        this.eventMetadata = eventMetadata;
    }
    public HashMap<String, Object> getContextSnapshot() {
        return contextSnapshot;
    }
    public void setContextSnapshot(HashMap<String, Object> contextSnapshot) {
        this.contextSnapshot = contextSnapshot;
    }
    public HashMap<String, Object> getEventAttributes() {
        return eventAttributes;
    }
    public void setEventAttributes(HashMap<String, Object> eventAttributes) {
        this.eventAttributes = eventAttributes;
    }

    public String getSubType() {
        return subType;
    }
    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getBusName() {
        return busName;
    }
    public void setBusName(String busName) {
        this.busName = busName;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", busId=" + busId +
                ", busName='" + busName + '\'' +
                ", eventType='" + eventType + '\'' +
                ", eventDesc='" + eventDesc + '\'' +
                ", eventPriority=" + eventPriority +
                ", channel='" + channel + '\'' +
                ", eventMetadata=" + eventMetadata +
                ", contextSnapshot=" + contextSnapshot +
                ", eventAttributes=" + eventAttributes +
                ", subType='" + subType + '\'' +
                '}';
    }

}