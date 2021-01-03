package com.wellsfargo.batch5.pms.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch5.pms.entity.UsersEntity;
import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.UsersModel;
import com.wellsfargo.batch5.pms.repo.UsersRepo;
import com.wellsfargo.batch5.pms.util.EMParser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UsersRepo usersRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		UserDetails userDetails = null;
		
		if(!usersRepo.existsByUserName(username)) {
			
			throw new UsernameNotFoundException("Invalid User Credentials!");
		}
		
		UsersEntity user = usersRepo.findByUserName(username);
		
		userDetails = new User(user.getUserName(), user.getPassword(),
				Collections.singletonList(new SimpleGrantedAuthority(user.getRole())));
		
		return userDetails;
	}
	
	public void registerMember(UsersModel users) throws PortfolioException {
		
		if(users != null) {
			
			if(users.getPassword().equals(users.getConfirmPassword())) {
				
				users.setPassword(encoder.encode(users.getPassword()));
				
				usersRepo.save(EMParser.parse(users));
				
			} else {
				
				throw new PortfolioException("Password do not match");
			}
		}		
	}

}
