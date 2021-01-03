package com.wellsfargo.batch5.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch5.pms.entity.UsersEntity;

@Repository
public interface UsersRepo extends JpaRepository<UsersEntity, Integer>{
	
	boolean existsByUserName(String userName);
	
	boolean existsByPanId(String panNumber);
	
	UsersEntity findByUserName(String userName);

}
