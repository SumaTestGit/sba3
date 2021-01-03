package com.wellsfargo.batch5.pms.service;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.CommodityModel;
import com.wellsfargo.batch5.pms.model.CompanyIPOModel;
import com.wellsfargo.batch5.pms.model.StocksPriceModel;

public interface IBackOfficeUserService {
	
	CommodityModel addCommodity(CommodityModel commodity)throws PortfolioException;
	
	StocksPriceModel addStock(StocksPriceModel stock)throws PortfolioException;
	
	CompanyIPOModel addCompany(CompanyIPOModel company)throws PortfolioException;
	
	CommodityModel modifyCommodity(CommodityModel commodity)throws PortfolioException;
	
	StocksPriceModel modifyStock(StocksPriceModel stock)throws PortfolioException;

}
