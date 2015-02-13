package com.target.trak.security.data.access.dao;

import com.target.trak.security.domain.TargetTrakUser;

public interface UserDetailsDao {

	public TargetTrakUser getUserByUsername(final String username);
	
	public void insertTargetTrakUser(final TargetTrakUser user);
}
