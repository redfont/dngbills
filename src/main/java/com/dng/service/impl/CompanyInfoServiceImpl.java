package com.dng.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dng.dao.CompanyInfoDao;
import com.dng.dto.CompanyInfoDTO;
import com.dng.models.CompanyInfo;
import com.dng.service.CompanyInfoService;

@Service
public class CompanyInfoServiceImpl implements CompanyInfoService{

	@Autowired
	private CompanyInfoDao companyInfoDao;
	
	@Override
	public List<CompanyInfo> getCompanyInfos(Integer serviceTypeId) {
		return companyInfoDao.getCompanyInfos(serviceTypeId);
	}

	@Override
	public List<CompanyInfoDTO> getCompanyInfosDto(Integer serviceTypeId) {
		List<CompanyInfoDTO> result = new ArrayList<CompanyInfoDTO>();
		
		for(CompanyInfo info : companyInfoDao.getCompanyInfos(serviceTypeId)){
			CompanyInfoDTO dto = new CompanyInfoDTO();
			dto.setCompanyName(info.getCompanyName());
			dto.setId(info.getId());
			dto.setIsActive(info.getIsActive());
			dto.setServiceTypeId(info.getServiceTypeId());
			result.add(dto);
		}
		return result;
	}

}
