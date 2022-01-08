package com.xworkz.data_company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.xworkz.data_company.entity.PatientEntity;

public class PatientDAOImp implements PatientDAO {
	
	public void create(PatientEntity entity)
	{
		System.out.println("Invoked create method in PatientDAOImp ");

		System.out.println(entity);

		Configuration con=new Configuration();

		con.configure();

		con.addAnnotatedClass(PatientEntity.class);

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
	
	public PatientEntity getById(int id)
	{
		System.out.println("Invoked getById method");
		System.out.println("Id : "+id);
		PatientEntity entity =null;

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			entity=session.get(PatientEntity.class, id);

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

	public void updateAgeById(int age,int id)
	{
		System.out.println("Invoked updateAgeById method");
		System.out.println("passed arguments newPpop= "+age+" Id : "+id);

		SessionFactory factory=new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			PatientEntity entity=session.get(PatientEntity.class, id);

			if(entity!=null)
			{
				entity.setAge(age);;
				session.update(entity);
				tx.commit();

				System.out.println("Updated Patient age at id= "+id);

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
		SessionFactory factory=new Configuration().configure().addAnnotatedClass(PatientEntity.class).buildSessionFactory();

		if(factory!=null)
		{
			Session session=factory.openSession();
			Transaction tx=session.beginTransaction();
			PatientEntity entity=session.get(PatientEntity.class, id);
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
