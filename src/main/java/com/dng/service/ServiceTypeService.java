package com.dng.service;

import java.util.List;

import com.dng.dto.ServiceTypeDTO;
import com.dng.models.ServiceType;

public interface ServiceTypeService {
	List<ServiceType> getServiceTypes();
	List<ServiceTypeDTO> getServiceTypeDto();
}
