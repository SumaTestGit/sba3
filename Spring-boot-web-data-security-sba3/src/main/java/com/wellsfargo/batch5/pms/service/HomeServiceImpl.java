package com.wellsfargo.batch5.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wellsfargo.batch5.pms.exception.PortfolioException;
import com.wellsfargo.batch5.pms.model.InvestorModel;
import com.wellsfargo.batch5.pms.model.UsersModel;
import com.wellsfargo.batch5.pms.repo.UsersRepo;
import com.wellsfargo.batch5.pms.util.EMParser;

@Service
public class HomeServiceImpl implements IHomeService{
	
	@Autowired
	private UsersRepo usersRepo;

	@Override
	public InvestorModel register(UsersModel user) throws PortfolioException {
		
		if(!usersRepo.existsByUserName(user.getUserName())) {
			
			if(!usersRepo.existsByPanId(user.getPAN())) {
				
				usersRepo.save(EMParser.parse(user));
			} else {
				throw new PortfolioException("PAN number already exists in the DB");
			}
			
		} else {
			
			throw new PortfolioException("Username already exists in the DB");
		}
		
		return null;
	}

	@Override
	public void login(UsersModel user) throws PortfolioException {
		
		
	}

}
