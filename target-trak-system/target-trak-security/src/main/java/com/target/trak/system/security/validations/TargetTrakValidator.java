package com.target.trak.system.security.validations;

import java.util.List;

import com.target.trak.system.security.dto.SecurityValidationError;
import com.target.trak.system.security.exceptions.TargetTrakSecurityException;

public interface TargetTrakValidator<T> {

	public List<SecurityValidationError> validate(T object) throws TargetTrakSecurityException;
}
