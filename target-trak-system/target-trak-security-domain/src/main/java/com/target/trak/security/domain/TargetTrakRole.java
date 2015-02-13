package com.target.trak.security.domain;

import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public class TargetTrakRole implements GrantedAuthority {

	private static final long serialVersionUID = 1L;

	private Long roleId;
	private String name;
	private List<Privilege> privileges;

	@Override
	public String getAuthority() {
		return name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

}
