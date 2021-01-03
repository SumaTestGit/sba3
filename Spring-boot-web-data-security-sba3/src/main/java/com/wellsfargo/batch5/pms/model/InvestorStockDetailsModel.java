package com.wellsfargo.batch5.pms.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class InvestorStockDetailsModel {
	
	private Integer investorStockId;
	
	@NotNull(message="Investor cannot be null")
	@NotBlank(message="Investor cannot be blank")
	private InvestorModel investor;
	
	@NotNull(message="Stock cannot be null")
	@NotBlank(message="Stock cannot be blank")
	private StocksPriceModel stock;
	
	@NotNull(message="Quantity cannot be null")
	@Min(value=1,message="Quantity cannot be negative or zero")
	private Integer quantity;
	
	public InvestorStockDetailsModel() {
		
	}

	public InvestorStockDetailsModel(Integer investorStockId, InvestorModel investor, StocksPriceModel stock,
			Integer quantity) {
		
		super();
		this.investorStockId = investorStockId;
		this.investor = investor;
		this.stock = stock;
		this.quantity = quantity;
	}

	public Integer getInvestorStockId() {
		return investorStockId;
	}

	public void setInvestorStockId(Integer investorStockId) {
		this.investorStockId = investorStockId;
	}

	public InvestorModel getInvestor() {
		return investor;
	}

	public void setInvestor(InvestorModel investor) {
		this.investor = investor;
	}

	public StocksPriceModel getStock() {
		return stock;
	}

	public void setStock(StocksPriceModel stock) {
		this.stock = stock;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}	
}
