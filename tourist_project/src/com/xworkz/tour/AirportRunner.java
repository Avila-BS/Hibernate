package com.xworkz.tour;

import com.xworkz.tour.dao.AirportDAO;
import com.xworkz.tour.dao.AirportDAOImpl;
import com.xworkz.tour.entity.AirportEntity;

public class AirportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AirportEntity entity=new AirportEntity(1,"Emirates","1S456t8","India","Canada",75000.00d,200);
		AirportDAO dao=new AirportDAOImpl();
		
		dao.put(entity);
	}

}
