package com.target.trak.system.security.validations;

import java.util.List;

import org.springframework.stereotype.Component;

import com.target.trak.system.security.dto.SecurityValidationError;
import com.target.trak.system.security.dto.registration.RegistrationApiRequest;
import com.target.trak.system.security.exceptions.TargetTrakSecurityException;

@Component("registrationValidator")
public class RegistrationValidator implements TargetTrakValidator<RegistrationApiRequest> {

	@Override
	public List<SecurityValidationError> validate(final RegistrationApiRequest object) throws TargetTrakSecurityException {
		
		return null;
	}

}
