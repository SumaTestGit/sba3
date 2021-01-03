package com.wellsfargo.batch5.pms.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.wellsfargo.batch5.pms.entity.StocksPriceEntity;

public class CompanyIPOModel {
	
	private Integer companyCode;
	
	@NotNull(message="Company title cannot be null")
	@NotBlank(message="Company title cannot be blank")
	private String companyTitle;
	
	@NotNull(message="Operations cannot be null")
	@NotBlank(message="Operations cannot be blank")
	private String operations;
	
	@NotNull(message="Share Count cannot be null")
	@Min(value=1,message="Share Count cannot be negative or zero")
	private Integer shareCount;	
	
	@NotNull(message="Open Share Price cannot be null")
	@Min(value=1,message="Open Share Price cannot be negative or zero")
	private Double openSharePrice;
	
	@NotNull(message="Sector cannot be null")
	@NotBlank(message="Sector cannot be blank")
	private String sector;
	
	@NotNull(message="Currency cannot be null")
	@NotBlank(message="Currency cannot be blank")
	private String currency;
	
	@NotNull(message="Turn over cannot be null")
	@Min(value=1,message="Turn over cannot be negative or zero")
	private Double turnOver;
		
	private StocksPriceEntity stock;

	public CompanyIPOModel() {
		
	}
	
	public CompanyIPOModel(Integer companyCode, String companyTitle, String operations, Integer shareCount, 
			Double openSharePrice, String sector, String currency, Double turnOver, StocksPriceEntity stock) {
		
		super();
		this.companyCode = companyCode;
		this.companyTitle = companyTitle;
		this.operations = operations;
		this.shareCount = shareCount;
		this.openSharePrice = openSharePrice;
		this.sector = sector;
		this.currency = currency;
		this.turnOver = turnOver;
		this.stock = stock;
	}

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
