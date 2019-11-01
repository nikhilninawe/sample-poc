/**
 * 
 */
package com.turvo.connect.model;

import java.io.Serializable;

/**
 * A Simple domain model object that will be used while routing messages to the
 * subscribers via the Exchange. Provides information whether the entity Id will
 * need to be extracted from the payload and if so, what its Json Path is.
 * 
 * @author v-gowri.s
 *
 */
public class MessageRoutingMetadata implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6961116025533285571L;

	/**
	 * Whether entity id should be extracted from message payload. Preferably, we
	 * would like the entity_id to be available as part of HTTP Header. In case it's
	 * not available, this switch being true indicates that it should be picked up
	 * from the payload.
	 */
	private boolean entityIdExtractionFallbackEnabled;

	private String entityIdJsonPath;

	/**
	 * @param entityIdExtractionFallbackEnabled
	 * @param entityIdJsonPath
	 */
	public MessageRoutingMetadata(boolean entityIdExtractionFallbackEnabled, String entityIdJsonPath) {
		super();
		this.entityIdExtractionFallbackEnabled = entityIdExtractionFallbackEnabled;
		this.entityIdJsonPath = entityIdJsonPath;
	}

	/**
	 * @return the entityIdExtractionFallbackEnabled
	 */
	public boolean isEntityIdExtractionFallbackEnabled() {
		return entityIdExtractionFallbackEnabled;
	}

	/**
	 * @return the entityIdJsonPath
	 */
	public String getEntityIdJsonPath() {
		return entityIdJsonPath;
	}

	@Override
	public String toString() {
		return "MessageRoutingMetadata [entityIdExtractionFallbackEnabled=" + entityIdExtractionFallbackEnabled
				+ ", entityIdJsonPath=" + entityIdJsonPath + "]";
	}

}
