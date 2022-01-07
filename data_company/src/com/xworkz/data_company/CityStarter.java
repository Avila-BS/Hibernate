package com.xworkz.data_company;

import com.xworkz.data_company.dao.CityDAO;
import com.xworkz.data_company.dao.CityDAOImp;
import com.xworkz.data_company.entity.CityEntity;

public class CityStarter {

	public static void main(String[] args) {
		CityEntity entity1=new CityEntity(1,"Udaipur",22678,"City of lakes","Green");
		CityEntity entity2=new CityEntity(2,"Banglore",8408976,"IT hub","Red");
		CityEntity entity3=new CityEntity(3,"Mumbai",675468,"Gateway Of India","Red");
		CityEntity entity4=new CityEntity(4,"Varanasi",965334,"Historical and spiritual city","Yellow");
		CityEntity entity5=new CityEntity(5,"Agra",456756,"Taj Mahal","Green");
		
		CityDAO dao=new CityDAOImp();
		
		dao.create(entity1);
		dao.create(entity2);
		dao.create(entity3);
		dao.create(entity4);
		dao.create(entity5);

	}

}
