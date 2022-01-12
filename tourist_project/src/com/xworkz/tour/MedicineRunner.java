package com.xworkz.tour;

import com.xworkz.tour.dao.MedicineDAO;
import com.xworkz.tour.dao.MedicineDAOImpl;
import com.xworkz.tour.entity.MedicineEntity;

public class MedicineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MedicineEntity entity = new MedicineEntity(1,"Dolo 650","Appollo","01-08-2021","05-05-2023","Fever",250);
		
		MedicineDAO dao=new MedicineDAOImpl();
dao.put(entity);
	}

}
