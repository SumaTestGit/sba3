package com.wellsfargo.batch5.pms.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wellsfargo.batch5.pms.entity.StocksPriceEntity;

public interface StocksPriceRepo extends JpaRepository<StocksPriceEntity, Integer> {
	
	boolean existsByStockExchange(String stockExchange);
	
	boolean existsByCompanyTitle(String companyTitle);
	
}
