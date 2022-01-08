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

}



