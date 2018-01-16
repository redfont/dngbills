package com.dng.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="payment_info")
public class PaymentInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="payment_info_id")
	private Integer id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created", insertable=false, updatable=false)
	private Date dateCreated;
	
	@Column(name="company_info_id")
	private Integer companyInfoId;
	
	@Column(name="is_cancelled")
	private Boolean isCancelled;
	
	@Column(name="paid_thru")
	private String eWallet;
	
	@Column(name="interface_trx_id")
	private String eWalletTrxId;
	
	@Column(name="trx_fee")
	private Double trxFee;
	
	@Column(name="bill_amount")
	private Double billAmount;
	
	@Column(name="atm_ref_num")
	private String atmRefNum;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_updated")
	private Date dateUpdated;
	
	public PaymentInfo(){
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Integer getCompanyInfoId() {
		return companyInfoId;
	}

	public void setCompanyInfoId(Integer companyInfoId) {
		this.companyInfoId = companyInfoId;
	}

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public String geteWallet() {
		return eWallet;
	}

	public void seteWallet(String eWallet) {
		this.eWallet = eWallet;
	}

	public String geteWalletTrxId() {
		return eWalletTrxId;
	}

	public void seteWalletTrxId(String eWalletTrxId) {
		this.eWalletTrxId = eWalletTrxId;
	}

	public Double getTrxFee() {
		return trxFee;
	}

	public void setTrxFee(Double trxFee) {
		this.trxFee = trxFee;
	}

	public Double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(Double billAmount) {
		this.billAmount = billAmount;
	}

	public String getAtmRefNum() {
		return atmRefNum;
	}

	public void setAtmRefNum(String atmRefNum) {
		this.atmRefNum = atmRefNum;
	}

	public Date getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(Date dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

}
