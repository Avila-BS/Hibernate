package com.xworkz.product.dao;

import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.product.entity.ProductEntity;
import com.xworkz.product.util.EMFUtill;



public class ProductDAOImpl implements ProductDAO {
	@Override
	public void save(ProductEntity entity)
	{
		
		EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		
		
		try
		{
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
	public void saveAll(List<ProductEntity> entities)
	{
		EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx=entityManager.getTransaction();
		tx.begin();
		
		try {
			for(ProductEntity en:entities)
			{
				
				entityManager.persist(en);
				int flushCount=0;
				if(flushCount==10)
				{
					entityManager.flush();
					entityManager.clear();
					flushCount=0;
					System.out.println("batch flushed");
					
				}
				flushCount++;
			}
			tx.commit();
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
			tx.rollback();
		}
	}
	@Override
	public List<ProductEntity> getAll()
	{
		EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getAll");
			return (List<ProductEntity>) query.getResultList();
		
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entityManager.close();
		}
		
		
		return null;
	}
	
	
	@Override
	public List<ProductEntity> getByPriceGreaterThan(double price)
	{
EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByPriceGreaterThan");
			query.setParameter("pric", price);
			return (List<ProductEntity>) query.getResultList();
			
			
			
		
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entityManager.close();
		}
		
		
		return null;
	}
	
	@Override
	public List<ProductEntity> getByPriceLesserThan(double price)
	{
EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByPriceLesserThan");
			query.setParameter("cost", price);
			//Object obj=query.getResultList();
			//List<ProductEntity> say=(List<ProductEntity>)obj;
			//return say;
			return (List<ProductEntity>) query.getResultList();
		
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entityManager.close();
		}
		
		
		return null;
	}
	
	@Override
	public ProductEntity getByNameAndId(String name,int id)
	{
EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		
		try {
			Query query=entityManager.createNamedQuery("getByNameAndId");
			query.setParameter("nm", name);
			query.setParameter("sl", id);
			return (ProductEntity)query.getSingleResult();
		
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entityManager.close();
		}
		
		
		return null;
	}
	
	@Override
	public  double getMaxPrice()
	{
		EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getMaxPrice");
			
			return (double)query.getSingleResult();
		
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entityManager.close();
		}
		
		
		return 0;
	}
	
	public  double getTotalPrice()
	{
		EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
		try {
			Query query=entityManager.createNamedQuery("getTotalPrice");
			
			return (double)query.getSingleResult();
		
			
		}
		catch(PersistenceException e)
		{
			e.printStackTrace();
		}
		finally
		{
			entityManager.close();
		}
		
		
		return 0;
	}
	
public List<ProductEntity> getByNameLike(String name)
{
	EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	try {
		Query query=entityManager.createNamedQuery("getByNameLike");
		query.setParameter("?",name);
		return (List<ProductEntity>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	return null;
}

public List<Integer> getQuantityByName(String name)
{
	EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	try {
		Query query=entityManager.createNamedQuery("getQuantityByName");
		query.setParameter("namee",name);
		return (List<Integer>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	return null;
}
public  List<Object[]> getQuantityAndPriceByName(String name)
{
	EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	try {
		Query query=entityManager.createNamedQuery("getQuantityAndPriceByName");
		query.setParameter("nam",name);
		return (List<Object[]>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	
	return null;
}

public  Object[] getQuantityAndPriceByNameAndId(String name,int id)
{
	EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	try {
		Query query=entityManager.createNamedQuery("getQuantityAndPriceByNameAndId");
		query.setParameter("nam",name);
		query.setParameter("i", id);
		return (Object[])query.getSingleResult();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	
	return null;
}
public  List<ProductEntity> getByBrand(String brand)
{
	EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	
	try {
		Query query=entityManager.createNamedQuery("getByBrand");
		query.setParameter("br",brand);
	
		return (List<ProductEntity>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	return null;
}

public List<String> getBrandbyName(String name)
{
EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	
	try {
		Query query=entityManager.createNamedQuery("getBrandbyName");
		query.setParameter("nme",name);
	
		return (List<String>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	
	return null;
}

public  List<Object[]> getNameAndPrice()
{
EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	
	try {
		Query query=entityManager.createNamedQuery("getNameAndPrice");
	
		return (List<Object[]>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	return null;
}

public  List<Object[]> getNameAndPriceByBrand(String brand)
{
EntityManager entityManager=EMFUtill.getEntityManagerFactory().createEntityManager();
	
	try {
		Query query=entityManager.createNamedQuery("getNameAndPriceByBrand");
	query.setParameter("brnd", brand);
		return (List<Object[]>)query.getResultList();
		
	}
	catch(PersistenceException e)
	{
		e.printStackTrace();
	}
	finally
	{
		entityManager.close();
	}
	
	
	return null;
}

}
