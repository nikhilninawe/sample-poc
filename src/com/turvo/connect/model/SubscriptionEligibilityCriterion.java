package com.turvo.connect.model;

public class SubscriptionEligibilityCriterion {

	private String inputJsonPath;

	private String expectedValue;

	public SubscriptionEligibilityCriterion() {
		// TODO Auto-generated constructor stub
	}
	public SubscriptionEligibilityCriterion(String inputJsonPath, String valueToMatch) {
		super();
		this.inputJsonPath = inputJsonPath;
		this.expectedValue = valueToMatch;
	}

	public String getInputJsonPath() {
		return inputJsonPath;
	}

	public String getExpectedValue() {
		return expectedValue;
	}

	@Override
	public String toString() {
		return "SubscriptionEligibilityCriterion [inputJsonPath=" + inputJsonPath + ", expectedValue=" + expectedValue
				+ "]";
	}

}
