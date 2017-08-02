package com.itss.shops.authorization.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.itss.shops.common.exception.BadRequestException;
import com.itss.shops.entity.Account;
import com.itss.shops.repository.AccountRepository;


@Service
public class UserServiceImpl implements UserDetailsService{
	
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Account account = accountRepository.findByUserName(username);
		if(account == null) {
			throw new BadRequestException("Can't find username");
		}
		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		SimpleGrantedAuthority authority =  new SimpleGrantedAuthority("ROLE_" + account.getRole().toString());
		authorities.add(authority);
		return new org.springframework.security.core.userdetails.User(account.getUserName(), account.getPassWord(), authorities);
	}
	
	public UserServiceImpl() {
		
	}

}
