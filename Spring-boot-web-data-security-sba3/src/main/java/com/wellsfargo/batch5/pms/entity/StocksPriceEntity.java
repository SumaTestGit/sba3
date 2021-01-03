package com.wellsfargo.batch5.pms.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="stocks_price")
public class StocksPriceEntity {	
	
	@Id
	@GeneratedValue
	@Column(name="stock_id")
	private Integer stockId;	
		
	@Column(name="operations",nullable=true)
	private String stockExchange;
	
	@Column(name="share_count",nullable=true)
	private Double currentPrice;
	
	@Column(name="date",nullable=true)
	private LocalDate date;
	
	@Column(name="time",nullable=true)
	private LocalTime time;	
		
	@OneToOne
	@JoinColumn(name="company_code")
	private CompanyIPOEntity listedCompanyIPO;
	
	public StocksPriceEntity() {
		
	}

	public StocksPriceEntity(Integer stockId, String stockExchange, Double currentPrice, LocalDate date, LocalTime time,
			CompanyIPOEntity listedCompanyIPO) {
		
		super();
		this.stockId = stockId;
		this.stockExchange = stockExchange;
		this.currentPrice = currentPrice;
		this.date = date;
		this.time = time;
		this.listedCompanyIPO = listedCompanyIPO;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public Double getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(Double currentPrice) {
		this.currentPrice = currentPrice;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public CompanyIPOEntity getListedCompanyIPO() {
		return listedCompanyIPO;
	}

	public void setListedCompanyIPO(CompanyIPOEntity listedCompanyIPO) {
		this.listedCompanyIPO = listedCompanyIPO;
	}

}
