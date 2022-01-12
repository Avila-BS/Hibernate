package com.xworkz.tour;

import com.xworkz.tour.dao.RailwayDAO;
import com.xworkz.tour.dao.RailwayDAOImpl;
import com.xworkz.tour.entity.RailwayStationEntity;

public class RailwayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RailwayStationEntity en=new RailwayStationEntity(1,"Shatabdhi express",6543,"Banglore","Delhi","Sleeper",12);
		
		RailwayDAO dao=new RailwayDAOImpl();
		
		dao.put(en);

	}

}
