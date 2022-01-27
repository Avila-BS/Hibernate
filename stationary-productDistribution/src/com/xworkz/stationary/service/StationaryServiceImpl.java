package com.xworkz.stationary.service;

import com.xworkz.stationary.dao.StationaryDAO;
import com.xworkz.stationary.entity.StationaryEntity;

public class StationaryServiceImpl implements StationaryService {
	
	private StationaryDAO dao;
	//private boolean vaild=true;
	 boolean valid=true;
	 
	 public StationaryServiceImpl(StationaryDAO dao)
	 {
		 this.dao=dao;
	 }
	
	public boolean validateAndSave(StationaryEntity entity)
	{
	 
		
		if(entity.getStationaryName()!=null && entity.getStationaryName().length()>=3 && entity.getStationaryName().length()<=200 )
		{
			
			valid=true;
			return valid;
		}
		else
		{
			System.out.println("invalid input");
			valid=false;
			return valid;
		}
		
	}
	
	

}
