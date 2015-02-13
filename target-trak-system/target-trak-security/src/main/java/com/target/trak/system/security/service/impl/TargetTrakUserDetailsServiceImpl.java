package com.target.trak.system.security.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.target.trak.security.data.access.dao.UserDetailsDao;
import com.target.trak.security.data.access.dao.UserRoleDao;
import com.target.trak.security.domain.TargetTrakRole;
import com.target.trak.security.domain.TargetTrakUser;

@Service("targetTrakUserDetailsService")
public class TargetTrakUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserDetailsDao userDetailsDao;

	@Autowired
	private UserRoleDao userRoleDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (StringUtils.isEmpty(username)) {
			throw new UsernameNotFoundException("Username: ["+username+"] not found");
		}
		
		TargetTrakUser user = (TargetTrakUser) userDetailsDao.getUserByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Username: ["+username+"] not found");
		}
		
		List<TargetTrakRole> roles = userRoleDao.getUserRoles(username);
		user.setAuthorities(roles);
		return user;
	}

}
