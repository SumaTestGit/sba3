package com.wellsfargo.batch5.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch5.pms.repo.CommodityRepo;
import com.wellsfargo.batch5.pms.repo.StocksPriceRepo;
import com.wellsfargo.batch5.pms.util.EMParser;
import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CommodityModel;
import com.wellsfargo.batch5.pms.model.CompanyIPOModel;
import com.wellsfargo.batch5.pms.model.StocksPriceModel;

@Service
public class BackOfficeUserServiceImpl implements IBackOfficeUserService {
	
	@Autowired
	private CommodityRepo commodityRepo;
	
	@Autowired
	private StocksPriceRepo stocksPriceRepo;

	@Override
	public CommodityModel addCommodity(CommodityModel commodity) throws PortfolioException {
				
		if(!commodityRepo.existsByCommodityCode(commodity.getCommodityCode())) {
			
			if(!commodityRepo.existsByUserName(commodity.getCommodityName())) {
				
				commodityRepo.save(EMParser.parse(commodity));	
				
			} else {
				
				throw new PortfolioException("Commodity "+commodity.getCommodityName()+" already exists!");
			}
			
		} else {
			
			throw new PortfolioException("Commodity code already exists in the DB.");
		}
		
		return null;
	}

	@Override
	public StocksPriceModel addStock(StocksPriceModel stock) throws PortfolioException {
		
		if(stock != null) {
			
			if(!stocksPriceRepo.existsByCompanyTitle(stock.getListedCompanyIPO().getCompanyTitle()) || (!stocksPriceRepo.existsByStockExchange(stock.getStockExchange()))) {		
				
				stocksPriceRepo.save(EMParser.parse(stock));		 
		
			} else {
			
				throw new PortfolioException("Company IPO "+stock.getListedCompanyIPO().getCompanyTitle()+" with Stock Exchange "+stock.getStockExchange()+" already exists!");
			}
			
		}			
			
		return stock;
	}

	@Override
	public CompanyIPOModel addCompany(CompanyIPOModel company) throws PortfolioException {
		
		return null;
	}

	@Override
	public CommodityModel modifyCommodity(CommodityModel commodity) throws PortfolioException {
		
		return null;
	}

	@Override
	public StocksPriceModel modifyStock(StocksPriceModel stock) throws PortfolioException {
		
		return null;
	}
}
