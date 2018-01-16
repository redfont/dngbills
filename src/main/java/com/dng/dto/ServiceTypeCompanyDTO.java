package com.dng.dto;

import java.util.List;

public class ServiceTypeCompanyDTO {

	private ServiceTypeDTO serviceTypeDto;
	private List<CompanyInfoDTO> companyInfoDto;
	
	public ServiceTypeDTO getServiceTypeDto() {
		return serviceTypeDto;
	}
	public void setServiceTypeDto(ServiceTypeDTO serviceTypeDto) {
		this.serviceTypeDto = serviceTypeDto;
	}
	public List<CompanyInfoDTO> getCompanyInfoDto() {
		return companyInfoDto;
	}
	public void setCompanyInfoDto(List<CompanyInfoDTO> companyInfoDto) {
		this.companyInfoDto = companyInfoDto;
	}
}
