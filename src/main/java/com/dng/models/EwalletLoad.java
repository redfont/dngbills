package com.dng.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="e_wallet_load")
public class EwalletLoad implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="e_wallet_load_id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="date_created")
	private Date dateCreated;
	
	@Column(name="is_cancelled")
	private Boolean isCancelled;
	
	@Column(name="trx_fee")
	private Double trxFee;

	public EwalletLoad(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public Double getTrxFee() {
		return trxFee;
	}

	public void setTrxFee(Double trxFee) {
		this.trxFee = trxFee;
	}
}
