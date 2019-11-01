package com.turvo.connect.model;

/**
 * Provides information on what Subscribe queue name prefix to use and how many
 * Queue instances should be declared and bound to the RabbitMQ Exchange.
 * 
 * @author v-gowri.s
 *
 */
public class ConnectQueueMetadata {

	private Integer queueCount;

	private String queueNamePrefix;

	/**
	 * @param queueName
	 * @param queueCount
	 */
	public ConnectQueueMetadata(String queueName, Integer queueCount) {
		super();
		this.queueNamePrefix = queueName;
		this.queueCount = queueCount;
	}

	/**
	 * @return the queueCount
	 */
	public Integer getQueueCount() {
		return queueCount;
	}

	/**
	 * @return the queueName
	 */
	public String getQueueName() {
		return queueNamePrefix;
	}

}
