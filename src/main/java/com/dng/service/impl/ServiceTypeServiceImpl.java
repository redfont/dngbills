package com.dng.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dng.dao.ServiceTypeDao;
import com.dng.dto.ServiceTypeDTO;
import com.dng.models.ServiceType;
import com.dng.service.ServiceTypeService;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService{

	@Autowired
	private ServiceTypeDao serviceTypeDao;
	
	@Override
	public List<ServiceType> getServiceTypes() {
		return serviceTypeDao.getServiceTypes();
	}

	@Override
	public List<ServiceTypeDTO> getServiceTypeDto() {
		List<ServiceTypeDTO> dtos = new ArrayList<ServiceTypeDTO>();
		for(ServiceType serviceType : serviceTypeDao.getServiceTypes()) {
			ServiceTypeDTO dto = new ServiceTypeDTO();
			dto.setIconLocation(serviceType.getIconLocation());
			dto.setServiceTypeId(serviceType.getServiceTypeId());
			dto.setServiceTypeName(serviceType.getServiceTypeName());
			dto.setServiceUrl(serviceType.getServiceUrl());
			
			dtos.add(dto);
		}
		return dtos;
	}

}
