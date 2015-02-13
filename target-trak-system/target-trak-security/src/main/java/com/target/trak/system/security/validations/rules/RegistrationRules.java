package com.target.trak.system.security.validations.rules;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.target.trak.security.data.access.dao.UserDetailsDao;

@Component("registrationRules")
public class RegistrationRules {

	@Autowired
	private UserDetailsDao userDetailsDao;
	
//	@Autowired
//	@Qualifier("registrationRules")
//	private Properties registrationRules;
}
