package com.dng.dao;

import java.util.List;

import com.dng.models.CompanyInfo;

public interface CompanyInfoDao {
	List<CompanyInfo> getCompanyInfos(Integer serviceTypeId);
}
