package com.dng.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service_type")
public class ServiceType implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="service_type_id")
	private Integer serviceTypeId;
	
	@Column(name="service_type_name")
	private String serviceTypeName;
	
	@Column(name="service_url")
	private String serviceUrl;
	
	@Column(name="icon_location")
	private String iconLocation;
	
	public ServiceType(){
		
	}

	public Integer getServiceTypeId() {
		return serviceTypeId;
	}

	public void setServiceTypeId(Integer serviceTypeId) {
		this.serviceTypeId = serviceTypeId;
	}

	public String getServiceTypeName() {
		return serviceTypeName;
	}

	public void setServiceTypeName(String serviceTypeName) {
		this.serviceTypeName = serviceTypeName;
	}

	public String getServiceUrl() {
		return serviceUrl;
	}

	public void setServiceUrl(String serviceUrl) {
		this.serviceUrl = serviceUrl;
	}

	public String getIconLocation() {
		return iconLocation;
	}

	public void setIconLocation(String iconLocation) {
		this.iconLocation = iconLocation;
	}
}
