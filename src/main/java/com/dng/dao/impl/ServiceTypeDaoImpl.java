package com.dng.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dng.dao.ServiceTypeDao;
import com.dng.models.ServiceType;

@Repository
public class ServiceTypeDaoImpl implements ServiceTypeDao {

	@PersistenceContext(unitName="dng")
	private EntityManager em;
	
	@Override
	public List<ServiceType> getServiceTypes() {
		Query q = em.createQuery("select s from ServiceType s", ServiceType.class);
		@SuppressWarnings("unchecked")
		List<ServiceType> results = q.getResultList();
		return results;
	}

}
