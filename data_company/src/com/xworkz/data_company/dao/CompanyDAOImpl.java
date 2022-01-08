package com.xworkz.data_company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.data_company.entity.CompanyEntity;

public class CompanyDAOImpl implements CompanyDAO {
	@Override
	public void create(CompanyEntity entity)
	{
		System.out.println("Invoked create in CompanyDAO");
		System.out.println("Entity : ".concat(entity.toString()));
		
		Configuration configuration=new Configuration();
		
		configuration.configure();
		
		configuration.addAnnotatedClass(CompanyEntity.class);
		
		SessionFactory factory=configuration.buildSessionFactory();
		
		if(factory!=null)
		{
			Session session=factory.openSession();
			
			Transaction transaction=session.beginTransaction();
			
			session.save(entity);
			
			transaction.commit();
			
			session.close();
		}
		factory.close();
		
	}
	
	public CompanyEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		CompanyEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(CompanyEntity.class, id);

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

	public void updateDomainById(String newDomain,int id)
	{
		System.out.println("Invoked updateDomainById method");
		System.out.println("passed arguments newPpop= "+newDomain+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CompanyEntity entity=session.get(CompanyEntity.class, id);

			if(entity!=null)
			{
				entity.setCdomain(newDomain);
				session.update(entity);
				tx.commit();

				System.out.println("Updated Domain at id= "+id);

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
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(CompanyEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			CompanyEntity entity=session.get(CompanyEntity.class, id);
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



