package com.xworkz.data_company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.data_company.entity.CountryEntity;

public class CountryDAOImp implements CountryDAO{

	public void create(CountryEntity entity)
	{
		System.out.println("Invoked create method in CountryDAOImp ");

		System.out.println(entity);
		
		Configuration con=new Configuration();
		
		con.configure();
		
		con.addAnnotatedClass(CountryEntity.class);
		
		SessionFactory factory=con.buildSessionFactory();
		
		if(factory!=null)
		{
			Session session=factory.openSession();
			
			Transaction tx=session.beginTransaction();
			
			session.save(entity);
			
			tx.commit();
			
			session.close();
			
		}
		
		factory.close();

	}

}
