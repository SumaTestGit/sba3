package com.wellsfargo.batch5.pms.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PortfolioWalletModel {
	
	@NotBlank(message="Wallet Balance cannot be blank")
	@NotNull(message="Wallet Balance cannot be null")
	@DecimalMin(value="0", message="Portfolio wallet cannot be less than 0")
	private Double walletBalance;
	
	public PortfolioWalletModel() {
		
	}

	public PortfolioWalletModel(Double walletBalance) {
		super();
		this.walletBalance = walletBalance;
	}

	public Double getWalletBalance() {
		return walletBalance;
	}

	public void setWalletBalance(Double walletBalance) {
		this.walletBalance = walletBalance;
	}
}
