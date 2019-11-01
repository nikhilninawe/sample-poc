/**
 * 
 */
package com.turvo.connect.model;

/**
 * @author srinivas.g
 *
 */
public class ChildMappingComponent {

	/**
	 * 
	 */
	public ChildMappingComponent() {
		// TODO Auto-generated constructor stub
	}

	private String entityId;
	private String entityIdType;
	private String entity;
	private String busId;
	private String criteria;
	
	
	/**
	 * @return the criteria
	 */
	public String getCriteria() {
		return criteria;
	}
	/**
	 * @param criteria the criteria to set
	 */
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	/**
	 * @return the entityId
	 */
	public String getEntityId() {
		return entityId;
	}
	/**
	 * @param entityId the entityId to set
	 */
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	/**
	 * @return the entity
	 */
	public String getEntity() {
		return entity;
	}
	/**
	 * @param entity the entity to set
	 */
	public void setEntity(String entity) {
		this.entity = entity;
	}
	/**
	 * @return the busId
	 */
	public String getBusId() {
		return busId;
	}
	/**
	 * @param busId the busId to set
	 */
	public void setBusId(String busId) {
		this.busId = busId;
	}

	public String getEntityIdType() {
		return entityIdType;
	}

	public void setEntityIdType(String entityIdType) {
		this.entityIdType = entityIdType;
	}

	@Override
	public String toString() {
		return "ChildMappingComponent{" +
				"entityId='" + entityId + '\'' +
				", entityIdType='" + entityIdType + '\'' +
				", entity='" + entity + '\'' +
				", busId='" + busId + '\'' +
				", criteria='" + criteria + '\'' +
				'}';
	}
}
