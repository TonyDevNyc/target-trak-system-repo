package com.target.trak.security.data.access.dao;

import java.util.List;

import com.target.trak.security.domain.TargetTrakRole;

public interface UserRoleDao {

	public List<TargetTrakRole> getUserRoles(final String username);
}
