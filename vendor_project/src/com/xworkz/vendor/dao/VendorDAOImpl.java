package com.xworkz.vendor.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;

import com.xworkz.singleton.EMFUtil;

import com.xworkz.vendor.entity.VendorEntity;

public class VendorDAOImpl implements VendorDAO {

	@Override
	public void save(VendorEntity entity) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = manager.getTransaction();

		try {
			tx.begin();
			manager.persist(entity);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			tx.rollback();
		}
	}

	public boolean findLogin(String loginName, String password) {
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("findLogin");
			query.setParameter("log", loginName);
			query.setParameter("pass", password);
			Object obj = query.getSingleResult();
			VendorEntity en = (VendorEntity) obj;
			System.out.println(en);
			if (obj != null) {
				return true;
			}

		}

		catch (PersistenceException e) {
			e.printStackTrace();
			return false;
		}
		
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
		return false;
		
	}
	
	public boolean findByEmail(String email)
	{
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();

		try {
			Query query = manager.createNamedQuery("findByEmail");
			query.setParameter("emaill", email);
		
			Object obj = query.getSingleResult();
			VendorEntity en = (VendorEntity) obj;
			System.out.println(en);
			if (obj != null) {
				return true;
			}

		}

		catch (PersistenceException e) {
			e.printStackTrace();
			return false;
		}
		
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
		return false;
		
	}

	public void updatePasswordByEmail(String email,String pwd)
	{
		EntityManager manager = EMFUtil.getEntityManagerFactory().createEntityManager();
		EntityTransaction tx = manager.getTransaction();

		try {
			tx.begin();
			Query query = manager.createNamedQuery("updatePasswordByEmail");
			query.setParameter("em", email);
			query.setParameter("pass", pwd);
		
			Object obj = query.executeUpdate();
			System.out.println(obj);
			tx.commit();

		} catch (PersistenceException e) {
			e.printStackTrace();
			tx.rollback();
		}
		
		finally
		{
			if(manager!=null)
			{
				manager.close();
			}
		}
	}
}
