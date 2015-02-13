package com.target.trak.system.security.converters;

import java.sql.Timestamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.target.trak.security.domain.TargetTrakUser;
import com.target.trak.system.security.dto.UserDto;

public class TargetTrakUserConverter implements Converter<UserDto, TargetTrakUser> {

	@Qualifier("encoder")
	@Autowired
	private BCryptPasswordEncoder encoder;

	@Override
	public TargetTrakUser convert(final UserDto source) {

		TargetTrakUser user = new TargetTrakUser();
		user.setFirstName(source.getFirstName());
		user.setLastName(source.getLastName());
		user.setEmail(source.getEmail());
		user.setMobileNumber(source.getMobileNumber());
		user.setUsername(source.getUsername());

		user.setPassword(encoder.encode(source.getPassword()));

		// TODO - Set as false - use confirm email
		user.setEnabled(true);

		user.setRegistrationDate(new Timestamp(source.getRegistrationDate().getTimeInMillis()));
		return user;
	}

}
