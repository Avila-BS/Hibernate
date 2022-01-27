package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.singleton.EMFUtil;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO{
	
	@Override
	public void save(VendorEntity entity)
	{
		EntityManager manager=EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx=manager.getTransaction();
		
		try
		{
			tx.begin();
			manager.persist(entity);
			tx.commit();
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
			tx.rollback();
		}
	}

}
