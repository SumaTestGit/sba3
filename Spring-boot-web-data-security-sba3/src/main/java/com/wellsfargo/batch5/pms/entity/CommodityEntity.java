package com.wellsfargo.batch5.pms.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="commodities")
public class CommodityEntity {
	
	@Id	
	@Column(name="commodity_code")
	private Integer commodityCode;
	
	@Column(name="commodity_name",nullable=true,unique=true)
	private String commodityName;
	
	@Column(name="commodity_current_price",nullable=true)
	private Double commodityCurrentPrice;
	
	@OneToMany(mappedBy="commodity")
	private Set<InvestorCommodityDetailsEntity> invCommodity;
	
	@Column(name="date")
	private LocalDate date;
	
	@Column(name="time")
	private LocalTime time;
	
	public CommodityEntity() {
		
	}

	public CommodityEntity(Integer commodityCode, String commodityName, Double commodityCurrentPrice,
			Set<InvestorCommodityDetailsEntity> invCommodity, LocalDate date, LocalTime time) {
		
		super();
		this.commodityCode = commodityCode;
		this.commodityName = commodityName;
		this.commodityCurrentPrice = commodityCurrentPrice;
		this.invCommodity = invCommodity;
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

	public Set<InvestorCommodityDetailsEntity> getInvCommodity() {
		return invCommodity;
	}

	public void setInvCommodity(Set<InvestorCommodityDetailsEntity> invCommodity) {
		this.invCommodity = invCommodity;
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
}
