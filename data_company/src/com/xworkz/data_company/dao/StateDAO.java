package com.xworkz.data_company.dao;


import com.xworkz.data_company.entity.StateEntity;

public interface StateDAO  {
	
	void create(StateEntity entity);
	
	default StateEntity getById(int id)
	{
		return null;
	}
	
	default void updateDistrictsById(int no,int id)
	{
	
	}
	
	default void deleteById(int id)
	{
		
	}

}
