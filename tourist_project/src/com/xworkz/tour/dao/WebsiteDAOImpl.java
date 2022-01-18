package com.xworkz.tour.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

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
	
	@Override
	public WebsiteEntity getByName()
	{
		EntityManager entityManager=EMFUtil.getEmf().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByNameGoogle");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity) obj;
			return entity;
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		return null;
	}
	
	public WebsiteEntity getByLikeURL()
	{
EntityManager entityManager=EMFUtil.getEmf().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByLikeURL");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity) obj;
			return entity;
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	@Override
	public WebsiteEntity getByMaxSince()
	{
EntityManager entityManager=EMFUtil.getEmf().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByMaxSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity) obj;
			return entity;
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		
		
		return null;
	}

	@Override
	public WebsiteEntity getByMinSince()
	{
EntityManager entityManager=EMFUtil.getEmf().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByMinSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity) obj;
			return entity;
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		
		
		return null;
	}
@Override
	public WebsiteEntity getBySecondMinSince()
	{
EntityManager entityManager=EMFUtil.getEmf().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getBySecondMinSince");
			Object obj=query.getSingleResult();
			WebsiteEntity entity=(WebsiteEntity) obj;
			return entity;
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		
		
		return null;
	}
public WebsiteEntity getBySecondMaxSince()
{
EntityManager entityManager=EMFUtil.getEmf().createEntityManager();
	
	try {
		Query query=entityManager.createNamedQuery("getBySecondMaxSince");
		Object obj=query.getSingleResult();
		WebsiteEntity entity=(WebsiteEntity) obj;
		return entity;
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	
	
	return null;
}
}
