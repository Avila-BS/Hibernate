package com.xworkz.tour;

import com.xworkz.tour.dao.SilkManufacturerDAO;
import com.xworkz.tour.dao.SilkManufacturerDAOImpl;
import com.xworkz.tour.entity.SilkManufacturerEntity;

public class SilkRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SilkManufacturerEntity entity1=new SilkManufacturerEntity(1,"Karnataka",32.25f,"moderate","Cotton silk",1500.00d,true);
		SilkManufacturerEntity entity2=new SilkManufacturerEntity(2,"Andhra Pradesh",27.25f,"poor","mulberry silk",2000.00d,true);
		SilkManufacturerEntity entity3=new SilkManufacturerEntity(3,"Tamil Nadu",19.25f,"rich","Tasar silk",3500.00d,true);
		
		SilkManufacturerDAO dao=new SilkManufacturerDAOImpl();
		
		//dao.put(entity1);
		
		dao.put(entity2);
		dao.put(entity3);
	}

}
