package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;


import com.xworkz.tour.entity.TouristEntity;
import com.xworkz.tour.utility.EMFUtil;

public class TouristDAOImpl implements TouristDAO {
	
	public void put(TouristEntity entity)
	{
		EntityManagerFactory emf=EMFUtil.getEmf();
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		entityManager.persist(entity);
		tx.commit();
		
	}

}
