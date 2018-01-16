package com.dng.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dng.models.CompanyInfo;
import com.dng.service.CompanyInfoService;

@Controller
@RequestMapping(value="/comp")
public class CompanyInfoController {

	@Autowired
	private CompanyInfoService companyInfoService;
	
	@RequestMapping(value="/index/{serviceTypeId}", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<CompanyInfo> index(@PathVariable("serviceTypeId") Integer serviceTypeId) {
		List<CompanyInfo> cInfos = companyInfoService.getCompanyInfos(serviceTypeId);
		return cInfos;
	}
}
