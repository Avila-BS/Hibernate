package com.xworkz.product.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMFUtill {

	private static EntityManagerFactory entityManagerFactory;

	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}
	
	static
	{
		entityManagerFactory= Persistence.createEntityManagerFactory("com.xworkz.product");
		
	}

}
