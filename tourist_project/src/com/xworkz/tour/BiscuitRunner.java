package com.xworkz.tour;

import com.xworkz.tour.dao.BiscuitDAO;
import com.xworkz.tour.dao.BiscuitDAOImpl;
import com.xworkz.tour.entity.BiscuitEntity;

public class BiscuitRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BiscuitEntity entity=new BiscuitEntity(1,"Dark Fantasy","Choclate",50.00f,6,"circle",false);
		
		BiscuitDAO dao=new BiscuitDAOImpl();
		
		dao.put(entity);
	}

}
