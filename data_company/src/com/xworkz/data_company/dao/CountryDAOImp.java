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
	public CountryEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		CountryEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(CountryEntity.class, id);

			if(entity!=null)
			{
				System.out.println("entity found at id= "+id);
			}

			else
			{
				System.out.println("No entity was found at id= "+id);
			}
			session.close();
		}

		factory.close();
		return entity;
	}

	@Override

	public void updateNameById(String country,int id)
	{
		System.out.println("Invoked updateNameById method");
		System.out.println("passed arguments newPpop= "+country+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CountryEntity entity=session.get(CountryEntity.class, id);

			if(entity!=null)
			{
				entity.setCountryName(country);
				session.update(entity);
				tx.commit();

				System.out.println("Updated Country name at id= "+id);

			}
			else
			{
				System.out.println("improper id ");
			}
			session.close();
		}
		factory.close();
	}
	@Override	
	public void deleteById(int id)
	{
		System.out.println("Invoked deleteById method");
		System.out.println("Id : "+id);
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CountryEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CountryEntity entity=session.get(CountryEntity.class, id);
			if(entity!=null)
			{
				session.delete(entity);
				tx.commit();
				System.out.println("Deleted entity at id= "+id);

			}
			else
			{
				System.out.println("no entity found at id= "+id);
			}

			session.close();

		}
		factory.close();

	}

}
