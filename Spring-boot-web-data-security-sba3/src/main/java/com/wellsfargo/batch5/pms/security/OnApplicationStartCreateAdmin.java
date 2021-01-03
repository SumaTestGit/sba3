package com.wellsfargo.batch5.pms.security;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.wellsfargo.batch5.pms.entity.UsersEntity;
import com.wellsfargo.batch5.pms.repo.UsersRepo;

@Component
public class OnApplicationStartCreateAdmin {
	
	@Autowired
	private UsersRepo usersRepo;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@EventListener
	public void checkAndCreateAdmin(ApplicationStartedEvent event) {
		
		if(!usersRepo.existsByUserName("admin")) {
			
			usersRepo.save(new UsersEntity(null, "admin", encoder.encode("admin"),"admin", "admin", "admin", "AFTTA4567S", "test", "9999912345", LocalDate.parse("01/01/1990"), "admin@gmail.com"));
		}
	}

}
