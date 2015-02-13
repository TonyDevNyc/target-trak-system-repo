package com.target.trak.system.security.dto;

public class SecurityValidationError {

	private String fieldName;
	private String errorMessage;

	public SecurityValidationError() {
	}

	public SecurityValidationError(final String fieldName, final String errorMessage) {
		this.fieldName = fieldName;
		this.errorMessage = errorMessage;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
