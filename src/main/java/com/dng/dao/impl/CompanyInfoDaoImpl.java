package com.dng.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.dng.dao.CompanyInfoDao;
import com.dng.models.CompanyInfo;

@Repository
public class CompanyInfoDaoImpl implements CompanyInfoDao {

	@PersistenceContext(unitName="dng")
	private EntityManager em;
	
	@Override
	public List<CompanyInfo> getCompanyInfos(Integer serviceTypeId) {
		StringBuilder qBuilder = new StringBuilder();
		qBuilder.append("select c from CompanyInfo c where c.serviceTypeId = :SERVICE_TYPE_ID")
				.append(" and c.isActive = :STATUS");
		Query q = em.createQuery(qBuilder.toString(), CompanyInfo.class);
		q.setParameter("SERVICE_TYPE_ID",serviceTypeId);
		q.setParameter("STATUS", Boolean.TRUE);
		@SuppressWarnings("unchecked")
		List<CompanyInfo> result = q.getResultList();
		return result;
	}

}
