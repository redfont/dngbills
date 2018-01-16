package com.dng.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dng.dto.CompanyInfoDTO;
import com.dng.dto.ServiceTypeCompanyDTO;
import com.dng.dto.ServiceTypeDTO;
import com.dng.models.ServiceType;
import com.dng.service.CompanyInfoService;
import com.dng.service.ServiceTypeService;

@Controller
@RequestMapping(value="/home")
public class HomeController {
	@Autowired
	private ServiceTypeService serviceTypeService;
	
	@Autowired
	private CompanyInfoService companyInfoService;
	
	@RequestMapping(value="/index", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<ServiceType> index(){
		/*for(ServiceType serviceType : serviceTypeService.getServiceTypes()) {
			System.out.println(serviceType.getServiceTypeName());
		}
		
		ModelAndView mv = new ModelAndView("landingpage");
		mv.addObject("serviceTypes", serviceTypeService.getServiceTypes());
		return mv;*/
		return serviceTypeService.getServiceTypes();
		
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<ServiceTypeCompanyDTO> getServiceTypeCompanies() {
		
		List<ServiceTypeDTO> serviceTypes = serviceTypeService.getServiceTypeDto();
		List<ServiceTypeCompanyDTO> result = new ArrayList<ServiceTypeCompanyDTO>();
		for(ServiceTypeDTO serviceType : serviceTypes) {
			ServiceTypeCompanyDTO dto = new ServiceTypeCompanyDTO();
			dto.setServiceTypeDto(serviceType);
			
			List<CompanyInfoDTO> cDto = companyInfoService.getCompanyInfosDto(serviceType.getServiceTypeId());
			dto.setCompanyInfoDto(cDto);
			
			result.add(dto);
		}
		
		return result;
	}
}
