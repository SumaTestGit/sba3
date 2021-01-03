package com.wellsfargo.batch5.pms.model;

import java.util.Set;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InvestorModel extends UsersModel {
	
	@NotNull(message="Is New user cannot be null")
	private Boolean isNewUser;
		
	@NotNull(message="Current Portfolio Value cannot be null")
	@NotBlank(message="Current Portfolio Value cannot be blank")
	@DecimalMin(value="0.1",message="Current Portfolio Value cannot be lessthan 0")
	private Double currentPortfolioValue;
	
	@NotNull(message="Amount Invested cannot be null")
	@NotBlank(message="Amount Invested cannot be blank")
	@DecimalMin(value="0.1",message="Amount Invested cannot be lessthan 0")
	private Double amountInvested;
	
	@NotNull(message="Amount Earned cannot be null")
	@NotBlank(message="Amount Earned cannot be blank")
	@DecimalMin(value="0.1",message="Amount Earned cannot be lessthan 0")
	private Double amountEarned;
	
	@NotNull(message="Recent Companies cannot be null")
	@NotBlank(message="Recent Companies cannot be blank")
	private String recentCompanies;
	
	@NotNull(message="Portfolio Wallet cannot be null")
	@NotBlank(message="Portfolio Wallet cannot be blank")
	private PortfolioWalletModel portWallet;
		
	private Set<InvestorCommodityDetailsModel> invCommodity;
		
	private Set<InvestorStockDetailsModel> invStock;

	public InvestorModel() {
		
	}

	public InvestorModel(Boolean isNewUser, Double currentPortfolioValue, Double amountInvested, Double amountEarned,
							String recentCompanies, PortfolioWalletModel portWallet, Set<InvestorCommodityDetailsModel> invCommodity, 
							Set<InvestorStockDetailsModel> invStock) {
		super();
		this.isNewUser = isNewUser;
		this.currentPortfolioValue = currentPortfolioValue;
		this.amountInvested = amountInvested;
		this.amountEarned = amountEarned;
		this.recentCompanies = recentCompanies;
		this.portWallet = portWallet;
		this.invCommodity = invCommodity;
		this.invStock = invStock;
	}

	public Boolean getIsNewUser() {
		return isNewUser;
	}

	public void setIsNewUser(Boolean isNewUser) {
		this.isNewUser = isNewUser;
	}

	public Double getCurrentPortfolioValue() {
		return currentPortfolioValue;
	}

	public void setCurrentPortfolioValue(Double currentPortfolioValue) {
		this.currentPortfolioValue = currentPortfolioValue;
	}

	public Double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(Double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public Double getAmountEarned() {
		return amountEarned;
	}

	public void setAmountEarned(Double amountEarned) {
		this.amountEarned = amountEarned;
	}

	public String getRecentCompanies() {
		return recentCompanies;
	}

	public void setRecentCompanies(String recentCompanies) {
		this.recentCompanies = recentCompanies;
	}

	public PortfolioWalletModel getPortWallet() {
		return portWallet;
	}

	public void setPortWallet(PortfolioWalletModel portWallet) {
		this.portWallet = portWallet;
	}

	public Set<InvestorCommodityDetailsModel> getInvCommodity() {
		return invCommodity;
	}

	public void setInvCommodity(Set<InvestorCommodityDetailsModel> invCommodity) {
		this.invCommodity = invCommodity;
	}

	public Set<InvestorStockDetailsModel> getInvStock() {
		return invStock;
	}

	public void setInvStock(Set<InvestorStockDetailsModel> invStock) {
		this.invStock = invStock;
	}

}
