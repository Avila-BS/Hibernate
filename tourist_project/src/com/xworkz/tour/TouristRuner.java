package com.xworkz.tour;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristRuner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TouristEntity entity=new TouristEntity(1,"Mysore",12.30f,"Palace",250.00d,"Summer");
		TouristEntity entity1=new TouristEntity(2,"Banglore",22.30f,"Wonderla",1000.00d,"Summer");
		
		TouristEntity entity2=new TouristEntity(3,"Kerala",37.30f,"Vismaya",800.00d,"winter");
		
		
		
		TouristDAO dao=new TouristDAOImpl();
		
		//dao.put(entity);
		dao.put(entity1);
		dao.put(entity2);

	}

}
