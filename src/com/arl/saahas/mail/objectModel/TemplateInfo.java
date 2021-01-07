package com.arl.saahas.mail.objectModel;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TemplateInfo implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String templateType;
    private String templateName;
    private long busId;
    private String template;
    private boolean active;
    private boolean deleted;
    private boolean isBusinessSpecific;
    private long versionId;
    private String key;
    private String from;
    private String fromName;
    private String replyTo;
    private String replyToName;
    private boolean isAttachment;
    private List<Map<String, String>> toAddresses;
    private List<HashMap<String, Object>> replyToAddresses;


    public List<HashMap<String, Object>> getReplyToAddresses() {
        return replyToAddresses;
    }
    public void setReplyToAddresses(List<HashMap<String, Object>> replyToAddresses) {
        this.replyToAddresses = replyToAddresses;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getFromName() {
        return fromName;
    }
    public void setFromName(String fromName) {
        this.fromName = fromName;
    }
    public String getReplyToName() {
        return replyToName;
    }
    public void setReplyToName(String replyToName) {
        this.replyToName = replyToName;
    }
    private String subject;

    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
    public String getReplyTo() {
        return replyTo;
    }
    public void setReplyTo(String replyTo) {
        this.replyTo = replyTo;
    }
    public boolean isAttachment() {
        return isAttachment;
    }
    public void setAttachment(boolean isAttachment) {
        this.isAttachment = isAttachment;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    public long getVersionId() {
        return versionId;
    }
    public void setVersionId(long versionId) {
        this.versionId = versionId;
    }
    public boolean isBusinessSpecific() {
        return isBusinessSpecific;
    }
    public void setBusinessSpecific(boolean isBusinessSpecific) {
        this.isBusinessSpecific = isBusinessSpecific;
    }
    public String getTemplateType() {
        return templateType;
    }
    public void setTemplateType(String templateType) {
        this.templateType = templateType;
    }
    public String getTemplateName() {
        return templateName;
    }
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
    public long getBusId() {
        return busId;
    }
    public void setBusId(long busId) {
        this.busId = busId;
    }
    public String getTemplate() {
        return template;
    }
    public void setTemplate(String template) {
        this.template = template;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    public boolean isDeleted() {
        return deleted;
    }
    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
    public List<Map<String, String>> getToAddresses() {
        return toAddresses;
    }
    public void setToAddresses(List<Map<String, String>> toAddresses) {
        this.toAddresses = toAddresses;
    }

    @Override
    public String toString() {
        return "TemplateInfo [templateType=" + templateType + ", templateName=" + templateName + ", busId=" + busId
                + ", template=" + template + ", active=" + active + ", deleted=" + deleted + ", isBusinessSpecific="
                + isBusinessSpecific + ", versionId=" + versionId + ", key=" + key + ", from=" + from + ", fromName="
                + fromName + ", replyTo=" + replyTo + ", replyToName=" + replyToName + ", isAttachment=" + isAttachment
                + ", replyToAddresses=" + replyToAddresses + ", subject=" + subject + "]";
    }


}
