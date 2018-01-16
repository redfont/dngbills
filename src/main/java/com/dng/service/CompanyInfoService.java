package com.dng.service;

import java.util.List;

import com.dng.dto.CompanyInfoDTO;
import com.dng.models.CompanyInfo;

public interface CompanyInfoService {
	List<CompanyInfo> getCompanyInfos(Integer serviceTypeId);
	List<CompanyInfoDTO> getCompanyInfosDto(Integer serviceTypeId);
}
