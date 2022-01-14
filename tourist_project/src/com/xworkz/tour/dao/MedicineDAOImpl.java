package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

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
	@Override
	public void putAll(List<MedicineEntity> entities)
	{
		EntityManagerFactory emf=EMFUtil.getEmf();
		EntityManager entityManager=emf.createEntityManager();
		//EntityTransaction tx=entityManager.getTransaction();
		
		
			for(MedicineEntity medicine:entities)
			{
				entityManager.persist(medicine);
				EntityTransaction tx=entityManager.getTransaction();
				tx.begin();
				int flushCount=0;
				try
				{
				for(int i=0;i<35;i++)
				{
				
				if(flushCount==10)
				{
					entityManager.flush();
					flushCount=0;
					entityManager.clear();
				}
				flushCount++;
				
				}
				}
				catch(PersistenceException e)
				{
					e.printStackTrace();
					tx.rollback();
				}
				tx.commit();;
			}
		
	}

}
