package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


public class InvestorCommodityDetailsModel{
	
	@NotNull(message="Investor Id cannot be null")
	private Integer investorId;
	
	@NotNull(message="Investor cannot be null")
	@NotBlank(message="Investor cannot be blank")
	private InvestorModel investor;
	
	@NotNull(message="Commodity cannot be null")
	@NotBlank(message="Commodity cannot be blank")
	private CommodityModel commodity;
	
	@NotNull(message="Quantity cannot be null")
	@Min(value=1,message="Quantity cannot be negative or zero")
	private Integer quantity;
	
	@NotNull(message="Date cannot be null")
	@Past(message="Date cannot be past")
	@Future(message="Date cannot be future")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate date;

	public InvestorCommodityDetailsModel() {
		
	}
	
	public InvestorCommodityDetailsModel(Integer investorId, InvestorModel investor,
			CommodityModel commodity, Integer quantity, LocalDate date) {
		
		super();
		this.investorId = investorId;
		this.investor = investor;
		this.commodity = commodity;
		this.quantity = quantity;
		this.date = date;
	}

	public Integer getInvestorId() {
		return investorId;
	}

	public void setInvestorId(Integer investorId) {
		this.investorId = investorId;
	}

	public InvestorModel getInvestor() {
		return investor;
	}

	public void setInvestor(InvestorModel investor) {
		this.investor = investor;
	}

	public CommodityModel getCommodity() {
		return commodity;
	}

	public void setCommodity(CommodityModel commodity) {
		this.commodity = commodity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}
