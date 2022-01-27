package com.xworkz.stationary.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.singleton.EMFUtil;
import com.xworkz.stationary.entity.StationaryEntity;

public class StationaryDAOImpl implements StationaryDAO{
	
	@Override
	public void save(StationaryEntity entity)
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
