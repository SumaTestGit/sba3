package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class StocksPriceModel {	
	
	@NotNull(message="Stock Id cannot be null")
	private Integer stockId;	
		
	@NotNull(message="Stock Exchange cannot be null")
	@NotBlank(message="Stock Exchange cannot be blank")
	private String stockExchange;
	
	@NotNull(message="Current Price cannot be null")
	@DecimalMin(value="0.1",message="Current Price cannot be lessthan 0.1")
	private Double currentPrice;
	
	@NotNull(message="Current Date cannot be null")
	@Past(message="Date cannot be past")
	@Future(message="Date cannot be future")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate date;
	
	@NotNull(message="Current Time cannot be null")
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime time;	
		
	@NotNull(message="Company IPO cannot be null")
	@NotBlank(message="Company IPO cannot be blank")
	private CompanyIPOModel listedCompanyIPO;
	
	public StocksPriceModel() {
		
	}

	public StocksPriceModel(Integer stockId, String stockExchange, Double currentPrice,
			LocalDate date, LocalTime time, CompanyIPOModel listedCompanyIPO) {
		
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

	public CompanyIPOModel getListedCompanyIPO() {
		return listedCompanyIPO;
	}

	public void setListedCompanyIPO(CompanyIPOModel listedCompanyIPO) {
		this.listedCompanyIPO = listedCompanyIPO;
	}
}
