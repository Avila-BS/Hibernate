package com.xworkz.tour.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import com.xworkz.tour.entity.RailwayStationEntity;
import com.xworkz.tour.utility.EMFUtil;

public class RailwayDAOImpl implements RailwayDAO {
	
	
	public void put(RailwayStationEntity entity)
	{
		EntityManagerFactory emf=EMFUtil.getEmf();
		EntityManager entityManager=emf.createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		entityManager.persist(entity);
		tx.commit();
		
	}
	
	public void putAll(List<RailwayStationEntity> entities)
	{
		EntityManagerFactory emf=EMFUtil.getEmf();
		EntityManager entityManager=emf.createEntityManager();
		//EntityTransaction tx=entityManager.getTransaction();
		
		
			for(RailwayStationEntity station:entities)
			{
				entityManager.persist(station);
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
				tx.commit();
			}
		
	}


}
