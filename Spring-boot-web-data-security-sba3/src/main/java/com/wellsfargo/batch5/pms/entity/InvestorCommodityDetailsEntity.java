package com.wellsfargo.batch5.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="investor_commodity_details")
public class InvestorCommodityDetailsEntity {
	
	@GeneratedValue
	@Id
	@Column(name="inv_id")
	private Integer investorId;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private InvestorEntity investor;
	
	@ManyToOne
	@JoinColumn(name="commodity_code")
	private CommodityEntity commodity;
	
	@Column(name="quantity")
	private Integer quantity;
	
	public InvestorCommodityDetailsEntity() {
		
	}

	public InvestorCommodityDetailsEntity(Integer investorId, InvestorEntity investor, CommodityEntity commodity,
			Integer quantity) {
		
		super();
		this.investorId = investorId;
		this.investor = investor;
		this.commodity = commodity;
		this.quantity = quantity;
	}

	public Integer getInvestorId() {
		return investorId;
	}

	public void setInvestorId(Integer investorId) {
		this.investorId = investorId;
	}

	public InvestorEntity getInvestor() {
		return investor;
	}

	public void setInvestor(InvestorEntity investor) {
		this.investor = investor;
	}

	public CommodityEntity getCommodity() {
		return commodity;
	}

	public void setCommodity(CommodityEntity commodity) {
		this.commodity = commodity;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}	
}
