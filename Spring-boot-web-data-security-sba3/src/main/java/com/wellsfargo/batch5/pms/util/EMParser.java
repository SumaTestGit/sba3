package com.wellsfargo.batch5.pms.util;


import com.wellsfargo.batch5.pms.entity.CommodityEntity;
import com.wellsfargo.batch5.pms.entity.CompanyIPOEntity;
import com.wellsfargo.batch5.pms.entity.InvestorCommodityDetailsEntity;
import com.wellsfargo.batch5.pms.entity.InvestorEntity;
import com.wellsfargo.batch5.pms.entity.InvestorStockDetailsEntity;
import com.wellsfargo.batch5.pms.entity.PortfolioWalletEntity;
import com.wellsfargo.batch5.pms.entity.StocksPriceEntity;
import com.wellsfargo.batch5.pms.entity.UsersEntity;
import com.wellsfargo.batch5.pms.model.CommodityModel;
import com.wellsfargo.batch5.pms.model.CompanyIPOModel;
import com.wellsfargo.batch5.pms.model.InvestorCommodityDetailsModel;
import com.wellsfargo.batch5.pms.model.InvestorModel;
import com.wellsfargo.batch5.pms.model.InvestorStockDetailsModel;
import com.wellsfargo.batch5.pms.model.PortfolioWalletModel;
import com.wellsfargo.batch5.pms.model.StocksPriceModel;
import com.wellsfargo.batch5.pms.model.UsersModel;

public class EMParser {
	
	public static UsersModel parse(UsersEntity source) {
		
		UsersModel target = new UsersModel();
		
		target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setPassword(source.getPassword());
		target.setRole(source.getRole());
		target.setPAN(source.getPAN());
		target.setContactAddress(source.getContactAddress());
		target.setMobileNumber(source.getMobileNumber());
		target.setDOB(source.getDOB());
		target.setEmail(source.getEmail());
		
		return target;
	}
	
	public static UsersEntity parse(UsersModel source) {
		
		UsersEntity target=new UsersEntity();
		
		target.setUserId(source.getUserId());
		target.setUserName(source.getUserName());
		target.setFirstName(source.getFirstName());
		target.setLastName(source.getLastName());
		target.setPassword(source.getPassword());
		target.setRole(source.getRole());
		target.setPAN(source.getPAN());
		target.setContactAddress(source.getContactAddress());
		target.setMobileNumber(source.getMobileNumber());
		target.setDOB(source.getDOB());
		target.setEmail(source.getEmail());		
		
		return target;		
	}
			
	public static PortfolioWalletEntity parse(PortfolioWalletModel source) {
		
		PortfolioWalletEntity target=new PortfolioWalletEntity();
		
		target.setWalletBalance(source.getWalletBalance());
		
		return target;
	}
	
	public static CompanyIPOEntity parse(CompanyIPOModel source) {
		
		CompanyIPOEntity target=new CompanyIPOEntity();
		
		target.setCompanyCode(source.getCompanyCode());
		target.setCompanyTitle(source.getCompanyTitle());		
		target.setOperations(source.getOperations());
		target.setShareCount(source.getShareCount());
		target.setOpenSharePrice(source.getOpenSharePrice());
		target.setSector(source.getSector());
		target.setCurrency(source.getCurrency());		
		target.setTurnOver(source.getTurnOver());
		target.setStock(source.getStock());
		
		return target;
	}
	
	public static CompanyIPOModel parse(CompanyIPOEntity source) {
		
		CompanyIPOModel target=new CompanyIPOModel();
		
		target.setCompanyCode(source.getCompanyCode());
		target.setCompanyTitle(source.getCompanyTitle());		
		target.setOperations(source.getOperations());
		target.setShareCount(source.getShareCount());
		target.setOpenSharePrice(source.getOpenSharePrice());
		target.setSector(source.getSector());
		target.setCurrency(source.getCurrency());		
		target.setTurnOver(source.getTurnOver());
		target.setStock(source.getStock());
		
		return target;
	}
	
	public static StocksPriceEntity parse(StocksPriceModel source) {
		
		StocksPriceEntity target = new StocksPriceEntity();
		
		target.setStockId(source.getStockId());
		target.setStockExchange(source.getStockExchange());			
		target.setCurrentPrice(source.getCurrentPrice());		
		target.setDate(source.getDate());			
		target.setTime(source.getTime());
		target.setListedCompanyIPO(EMParser.parse(source.getListedCompanyIPO()));
		
		return target;
	}
	
	public static StocksPriceModel parse(StocksPriceEntity source) {
		
		StocksPriceModel target = new StocksPriceModel();
		
		target.setStockId(source.getStockId());
		target.setStockExchange(source.getStockExchange());			
		target.setCurrentPrice(source.getCurrentPrice());		
		target.setDate(source.getDate());			
		target.setTime(source.getTime());
		target.setListedCompanyIPO(EMParser.parse(source.getListedCompanyIPO()));
		
		return target;
	}
	
	public static CommodityEntity parse(CommodityModel source) {
		
		CommodityEntity target = new CommodityEntity();
		
		target.setCommodityCode(source.getCommodityCode());
		target.setCommodityName(source.getCommodityName().toUpperCase());
		target.setCommodityCurrentPrice(source.getCommodityCurrentPrice());
		target.setInvCommodity(source.getInvCommodity());
		target.setDate(source.getDate());
		target.setTime(source.getTime());
		
		return target;
	}
	
	public static CommodityModel parse(CommodityEntity source) {
		
		CommodityModel target=new CommodityModel();
		
		target.setCommodityCode(source.getCommodityCode());
		target.setCommodityName(source.getCommodityName().toUpperCase());
		target.setCommodityCurrentPrice(source.getCommodityCurrentPrice());
		target.setInvCommodity(source.getInvCommodity());
		target.setDate(source.getDate());
		target.setTime(source.getTime());
		
		return target;
	}
	
	public static InvestorCommodityDetailsModel parse(InvestorCommodityDetailsEntity source) {
		
		InvestorCommodityDetailsModel target = new InvestorCommodityDetailsModel();
		
		target.setInvestorId(source.getInvestorId());
		target.setInvestor(EMParser.parse(source.getInvestor()));
		target.setCommodity(parse(source.getCommodity()));
		target.setQuantity(source.getQuantity());		
		
		return target;
	}
	
	public static InvestorModel parse(InvestorEntity source)  {
		
		InvestorModel target = new InvestorModel();
		
		target.setIsNewUser(source.getIsNewUser());
		target.setCurrentPortfolioValue(source.getCurrentPortfolioValue());
		target.setAmountInvested(source.getAmountInvested());
		target.setAmountEarned(source.getAmountEarned());
		target.setRecentCompanies(source.getRecentCompanies());
		//target.setInvCommodity(EMParser.parse(source.getInvCommodity()));		
		
		return target;
	}
	
	public static InvestorEntity parse(InvestorModel source) {
		
		InvestorEntity target = new InvestorEntity();
		
		target.setIsNewUser(source.getIsNewUser());
		target.setCurrentPortfolioValue(source.getCurrentPortfolioValue());
		target.setAmountInvested(source.getAmountInvested());
		target.setAmountEarned(source.getAmountEarned());
		target.setRecentCompanies(source.getRecentCompanies());
		//target.setInvCommodity(EMParser.parse(source.getInvCommodity()));	
		
		return target;
	}
	
	public static InvestorStockDetailsModel parse(InvestorStockDetailsEntity source) {
		
		InvestorStockDetailsModel target=new InvestorStockDetailsModel();
		
		target.setInvestorStockId(source.getInvestorStockId());
		target.setInvestor(EMParser.parse(source.getInvestor()));
		target.setStock(EMParser.parse(source.getStock()));
		target.setQuantity(source.getQuantity());
		
		return target;
	}
	
}
