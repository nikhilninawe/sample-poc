package com.turvo.connect.model;

/**
 * A wrapper type to encapsulate a given (parameterized) SQL query and its
 * arguments, if any.
 * 
 * @author v-gowri.s
 *
 */
public class AuditMessageSqlObject {

	private String parameterizedSql;

	private Object[] args;

	/**
	 * @param parameterizedSql
	 * @param args
	 */
	public AuditMessageSqlObject(String parameterizedSql, Object... args) {
		super();
		this.parameterizedSql = parameterizedSql;
		this.args = args;
	}

	/**
	 * @return the parameterizedSql
	 */
	public String getParameterizedSql() {
		return parameterizedSql;
	}

	/**
	 * @return the args
	 */
	public Object[] getArgs() {
		return args;
	}

}
