package com.target.trak.system.security.dto.registration;

import java.util.List;

import com.target.trak.system.security.dto.SecurityValidationError;

public class RegistrationApiResponse {

	private boolean success;
	private List<SecurityValidationError> errors;
	private String errorMessage;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public List<SecurityValidationError> getErrors() {
		return errors;
	}

	public void setErrors(List<SecurityValidationError> errors) {
		this.errors = errors;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}