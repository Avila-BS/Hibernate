package com.xworkz.data_company;

import com.xworkz.data_company.dao.CountryDAO;
import com.xworkz.data_company.dao.CountryDAOImp;
import com.xworkz.data_company.entity.CountryEntity;

public class CountryStarter {

	public static void main(String[] args) {
		//CountryEntity entity=new CountryEntity(1,"INDIA","ASIA",1400000000);
		CountryEntity entity1=new CountryEntity(2,"ALGERIA","AFRICA",23500758);
		CountryEntity entity2=new CountryEntity(3,"BRAZIL","AMERICA",4567687);
		CountryEntity entity3=new CountryEntity(4,"SRILANKA","ASIA",10567897);
		CountryEntity entity4=new CountryEntity(5,"TASMANIA","AUSTRALIA",567876);
		
		
		CountryDAO dao=new CountryDAOImp();
		
		//dao.create(entity);
		dao.create(entity1);
		dao.create(entity2);
		dao.create(entity3);
		dao.create(entity4);

	}

}
