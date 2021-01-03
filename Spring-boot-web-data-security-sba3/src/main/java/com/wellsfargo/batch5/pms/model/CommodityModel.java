package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.wellsfargo.batch5.pms.entity.InvestorCommodityDetailsEntity;

public class CommodityModel {
	
	@NotNull(message="Commodity code cannot be null")
	@Min(value=1,message="Commodity Code cannot be negative or zero")
	private Integer commodityCode;
	
	@NotNull(message="Commodity Name cannot be null")
	@NotBlank(message="Commodity Name cannot be null")
	@Size(min=3,max=30, message="Commodity Name length should be between 4 to 30 characters")
	private String commodityName;
	
	@NotNull(message="Commodity Current Price cannot be null")
	@DecimalMin(value="0.1",message="Commodity Current Price cannot be less than 0.1")
	private Double commodityCurrentPrice;
	
	@NotNull(message="Date cannot be null")
	@Past(message="Date cannot be past")
	@Future(message="Date cannot be future")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate date;
	
	@NotNull(message="Time cannot be null")
	@DateTimeFormat(iso=ISO.TIME)
	private LocalTime time;
	
	private Set<InvestorCommodityDetailsEntity> invCommodity;
	
	public CommodityModel() {
		
	}

	public CommodityModel(Integer commodityCode, String commodityName, Double commodityCurrentPrice,
			LocalDate date, LocalTime time) {
		super();
		this.commodityCode = commodityCode;
		this.commodityName = commodityName;
		this.commodityCurrentPrice = commodityCurrentPrice;
		this.date = date;
		this.time = time;
	}

	public Integer getCommodityCode() {
		return commodityCode;
	}

	public void setCommodityCode(Integer commodityCode) {
		this.commodityCode = commodityCode;
	}

	public String getCommodityName() {
		return commodityName;
	}

	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}

	public Double getCommodityCurrentPrice() {
		return commodityCurrentPrice;
	}

	public void setCommodityCurrentPrice(Double commodityCurrentPrice) {
		this.commodityCurrentPrice = commodityCurrentPrice;
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

	public Set<InvestorCommodityDetailsEntity> getInvCommodity() {
		return invCommodity;
	}

	public void setInvCommodity(Set<InvestorCommodityDetailsEntity> invCommodity) {
		this.invCommodity = invCommodity;
	}	
}
