package com.greatlearning.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UserDetailsRepositoryReactiveAuthenticationManager;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.student.entity.User;
import com.greatlearning.student.repostiory.UserRepository;
import com.greatlearning.student.security.MyUserDetails;

public class UserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user= userRepository.findByUserName(username);
		if(user==null) {
			throw new UsernameNotFoundException("User with Given name not found");
		}
		return new MyUserDetails(user);
	}

}
