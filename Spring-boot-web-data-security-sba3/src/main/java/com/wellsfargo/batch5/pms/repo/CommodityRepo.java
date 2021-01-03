package com.wellsfargo.batch5.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.batch5.pms.entity.CommodityEntity;

@Repository
public interface CommodityRepo extends JpaRepository<CommodityEntity, Integer> {
	
	boolean existsByCommodityCode(Integer commodityCode);
	
	boolean existsByUserName(String userName);

}
