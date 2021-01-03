package com.wellsfargo.batch5.pms.service;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.InvestorModel;
import com.wellsfargo.batch5.pms.model.UsersModel;

public interface IHomeService {
	
	InvestorModel register(UsersModel user) throws PortfolioException;
	
	void login(UsersModel user) throws PortfolioException;

}
