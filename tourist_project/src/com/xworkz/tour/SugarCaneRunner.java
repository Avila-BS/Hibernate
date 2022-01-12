package com.xworkz.tour;

import com.xworkz.tour.dao.SugarCaneDAO;
import com.xworkz.tour.dao.SugarCaneDAOImpl;
import com.xworkz.tour.entity.SugarCaneEntity;

public class SugarCaneRunner {
public static void main(String[] args)
{
	SugarCaneEntity entity=new SugarCaneEntity(1,"Karnataka",150.00d,93.67d,"Sugar");
	
	SugarCaneDAO dao=new SugarCaneDAOImpl();
	
	dao.put(entity);
}
}
