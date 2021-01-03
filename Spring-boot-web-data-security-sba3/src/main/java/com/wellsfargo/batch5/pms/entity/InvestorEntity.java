package com.wellsfargo.batch5.pms.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("investor")
@Table(name="investor")
public class InvestorEntity extends UsersEntity {
	
	@Column(name="is_new_user", nullable=false)
	private Boolean isNewUser;
		
	@Column(name="current_portfolio_value")
	private Double currentPortfolioValue;
	
	@Column(name="invested_amount")
	private Double amountInvested;
	
	@Column(name="amount_earned")
	private Double amountEarned;
	
	@Column(name="recent_companies")
	private String recentCompanies;
	
	@Embedded
	private PortfolioWalletEntity portWallet;
	
	@OneToMany(mappedBy="investor")
	private Set<InvestorCommodityDetailsEntity> invCommodity;
	
	@OneToMany(mappedBy="investor")
	private Set<InvestorStockDetailsEntity> invStock;

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

	public PortfolioWalletEntity getPortWallet() {
		return portWallet;
	}

	public void setPortWallet(PortfolioWalletEntity portWallet) {
		this.portWallet = portWallet;
	}

	public Set<InvestorCommodityDetailsEntity> getInvCommodity() {
		return invCommodity;
	}

	public void setInvCommodity(Set<InvestorCommodityDetailsEntity> invCommodity) {
		this.invCommodity = invCommodity;
	}

	public Set<InvestorStockDetailsEntity> getInvStock() {
		return invStock;
	}

	public void setInvStock(Set<InvestorStockDetailsEntity> invStock) {
		this.invStock = invStock;
	}	
}
