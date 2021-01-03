package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="investor_stock_details")
public class InvestorStockDetailsEntity {
	
	@GeneratedValue
	@Id
	@Column(name="inv_stock_id")
	private Integer investorStockId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private InvestorEntity investor;
	
	@ManyToOne
	@JoinColumn(name="stock_id")
	private StocksPriceEntity stock;
	
	@Column(name="quantity")
	private Integer quantity;
	
	public InvestorStockDetailsEntity() {
		
	}

	public InvestorStockDetailsEntity(Integer investorStockId, InvestorEntity investor, StocksPriceEntity stock,
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

	public InvestorEntity getInvestor() {
		return investor;
	}

	public void setInvestor(InvestorEntity investor) {
		this.investor = investor;
	}

	public StocksPriceEntity getStock() {
		return stock;
	}

	public void setStock(StocksPriceEntity stock) {
		this.stock = stock;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}	
}
