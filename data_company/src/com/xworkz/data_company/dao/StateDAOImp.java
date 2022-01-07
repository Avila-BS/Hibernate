package com.xworkz.data_company.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.xworkz.data_company.entity.StateEntity;

public class StateDAOImp implements StateDAO {

	public void create(StateEntity entity)
	{
		System.out.println("Invoked create method in StateDAOImp ");

		System.out.println(entity);

		Configuration con=new Configuration();

		con.configure();

		con.addAnnotatedClass(StateEntity.class);

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


