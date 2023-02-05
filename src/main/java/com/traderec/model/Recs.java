package com.traderec.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Recs {
	// Defining Rec id as primary key
	@Id
	@GeneratedValue( strategy= GenerationType. AUTO, generator="native" )
	private int recId;
	
	@Column
	private String recName;
	
	@Column
	private String recRegion;
	
	@Column
	private int taxAmount;

	public int getRecId() {
		return recId;
	}

	public void setRecId(int recId) {
		this.recId = recId;
	}

	public String getRecName() {
		return recName;
	}

	public void setRecName(String recName) {
		this.recName = recName;
	}

	public String getRecRegion() {
		return recRegion;
	}

	public void setRecRegion(String recRegion) {
		this.recRegion = recRegion;
	}

	public int getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}

}