package com.wellsfargo.batch5.pms.model;

import java.time.LocalDate;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

public class CommisionModel {	
	
	private Integer commisionId;
		
	private final Double commissonRate = 0.02;
	
	@NotNull(message="Commision value cannot be null")
	@NotBlank(message="Commision value cannot be blank")
	@Min(value=0,message="Commision value cannot be negative")
	private Double commisionValue;
	
	@NotNull(message="Date cannot be null")
	@Past(message="Date cannot be past")
	@Future(message="Date cannot be future")
	@DateTimeFormat(iso=ISO.DATE)
	private LocalDate date;
	
	public CommisionModel() {
		
	}

	public CommisionModel(Integer commisionId, Double commisionValue, LocalDate date) {
		super();
		this.commisionId = commisionId;
		this.commisionValue = commisionValue;
		this.date = date;
	}

	public Integer getCommisionId() {
		return commisionId;
	}

	public void setCommisionId(Integer commisionId) {
		this.commisionId = commisionId;
	}

	public Double getCommisionValue() {
		return commisionValue;
	}

	public void setCommisionValue(Double commisionValue) {
		this.commisionValue = commisionValue;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getCommissonRate() {
		return commissonRate;
	}
}
