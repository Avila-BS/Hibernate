package com.xworkz.data_company;

import com.xworkz.data_company.dao.PatientDAO;
import com.xworkz.data_company.dao.PatientDAOImp;
import com.xworkz.data_company.entity.PatientEntity;

public class PatientStarter {

	public static void main(String[] args) {
		/*PatientEntity entity1=new PatientEntity(1,"Rajesh","kannpur",true,32,4);
		PatientEntity entity2=new PatientEntity(2,"Meena","Ammathi",false,43,0);
		PatientEntity entity3=new PatientEntity(3,"Parvathi","Virajpet",false,67,0);
		PatientEntity entity4=new PatientEntity(4,"Suresh","Nangala",true,29,3);
		PatientEntity entity5=new PatientEntity(5,"Mukesh","Nelamangala",false,58,0);*/
		
		PatientDAO dao=new PatientDAOImp();
		
		//dao.create(entity1);
		//dao.create(entity2);
		//dao.create(entity3);
		//dao.create(entity4);
		//dao.create(entity5);
		
		
		//dao.getById(1);
		//dao.updateAgeById(25, 4);
		
		dao.deleteById(2);

	}

}
