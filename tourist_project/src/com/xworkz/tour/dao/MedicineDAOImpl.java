package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.xworkz.tour.entity.MedicineEntity;
import com.xworkz.tour.utility.EMFUtil;

public class MedicineDAOImpl implements MedicineDAO {
	
	public void put(MedicineEntity entity)
	{

		EntityManagerFactory emf=EMFUtil.getEmf();
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		entityManager.persist(entity);
		tx.commit();
		
	}

}
