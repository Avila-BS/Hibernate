package com.xworkz.tour;

import com.xworkz.tour.dao.FactoryDAO;
import com.xworkz.tour.dao.FactoryDAOImpl;
import com.xworkz.tour.entity.FactoryEntity;

public class FactoryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactoryEntity entity=new FactoryEntity(1,"Samsung Electronics","Electronic gadgets",865.87d,"Banglore",5,"Large Scale");
		
		FactoryDAO dao=new FactoryDAOImpl();
		dao.put(entity);

	}

}
