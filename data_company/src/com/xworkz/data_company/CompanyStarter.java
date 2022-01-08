package com.xworkz.data_company;

import com.xworkz.data_company.dao.CompanyDAO;
import com.xworkz.data_company.dao.CompanyDAOImpl;
import com.xworkz.data_company.entity.CompanyEntity;

public class CompanyStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CompanyEntity company=new CompanyEntity(1,"Capgemini","Service based","Java developer","www.capgemini.com");
		//CompanyEntity company1=new CompanyEntity(2,"Birla Soft","Product based","AWS developer","www.birlasoft.com");
		//CompanyEntity company2=new CompanyEntity(3,"Accenture","Product and service based","full stack developer","www.accenture.com");
		
		CompanyDAO dao=new CompanyDAOImpl();
		
		//dao.create(company2);
		
		//CompanyEntity res=dao.getById(2);
		//System.out.println(res);
		//dao.updateDomainById("front end developer", 3);
		dao.deleteById(1);
		
	}

}
