package com.turvo.connect.model;

/**
 * Created by srinivas.g on 23/06/17.
 */
public class ConnectRequestComponent {

	private String requestId;
    private String correlationId;
    private String batchId;
    private String customId;
    private String sourceBusId;
    private String destBusId;
    private String stage;
    private String topic;
    private String status;
    

    public String getSourceBusId() {
        return sourceBusId;
    }

    public void setSourceBusId(String sourceBusId) {
        this.sourceBusId = sourceBusId;
    }

    public String getDestBusId() {
        return destBusId;
    }

    public void setDestBusId(String destBusId) {
        this.destBusId = destBusId;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public String getBatchId() {
		return batchId;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}

	public String getCustomId() {
		return customId;
	}

	public void setCustomId(String customId) {
		this.customId = customId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
