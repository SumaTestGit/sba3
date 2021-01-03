package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="company_ipo")
public class CompanyIPOEntity {
	
	@Id	
	@Column(name="company_code")
	private Integer companyCode;
	
	@Column(name="company_title",nullable=true,unique=true)
	private String companyTitle;
	
	@Column(name="operations",nullable=true)
	private String operations;
	
	@Column(name="share_count",nullable=true)
	private Integer shareCount;
	
	@Column(name="open_share_price",nullable=true)
	private Double openSharePrice;
	
	@Column(name="sector",nullable=true)
	private String sector;
	
	@Column(name="currency",nullable=true)
	private String currency;
	
	@Column(name="turnover",nullable=true)
	private Double turnOver;
	
	@OneToOne(mappedBy = "company")
	private StocksPriceEntity stock;

	public Integer getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(Integer companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyTitle() {
		return companyTitle;
	}

	public void setCompanyTitle(String companyTitle) {
		this.companyTitle = companyTitle;
	}

	public String getOperations() {
		return operations;
	}

	public void setOperations(String operations) {
		this.operations = operations;
	}

	public Integer getShareCount() {
		return shareCount;
	}

	public void setShareCount(Integer shareCount) {
		this.shareCount = shareCount;
	}

	public Double getOpenSharePrice() {
		return openSharePrice;
	}

	public void setOpenSharePrice(Double openSharePrice) {
		this.openSharePrice = openSharePrice;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Double getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(Double turnOver) {
		this.turnOver = turnOver;
	}

	public StocksPriceEntity getStock() {
		return stock;
	}

	public void setStock(StocksPriceEntity stock) {
		this.stock = stock;
	}
	
	
	
}
