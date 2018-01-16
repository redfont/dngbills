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
@Table(name="loading_info")
public class LoadingInfo implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="loading_info_id")
	private Integer id;
	
	@Column(name="date_created")
	private Date dateCreated;
	
	@Column(name="is_cancelled")
	private Boolean isCancelled;
	
	@Column(name="network")
	private String network;
	
	@Column(name="load_amount")
	private Double loadAmount;
	
	public LoadingInfo(){
		
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

	public Boolean getIsCancelled() {
		return isCancelled;
	}

	public void setIsCancelled(Boolean isCancelled) {
		this.isCancelled = isCancelled;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public Double getLoadAmount() {
		return loadAmount;
	}

	public void setLoadAmount(Double loadAmount) {
		this.loadAmount = loadAmount;
	}
}
