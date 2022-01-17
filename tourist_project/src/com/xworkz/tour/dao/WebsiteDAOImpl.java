package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.WebsiteEntity;
import com.xworkz.tour.utility.EMFUtil;

public class WebsiteDAOImpl implements WebsiteDAO {
	
	public void add(WebsiteEntity entity)
	{
		EntityManagerFactory emf=EMFUtil.getEmf();
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		try {
		tx.begin();
		entityManager.persist(entity);
		tx.commit();
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
			tx.rollback();
		}
		
	}

}
