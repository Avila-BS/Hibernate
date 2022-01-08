package com.xworkz.data_company.dao;

import com.xworkz.data_company.entity.CityEntity;

public interface CityDAO {
	void create(CityEntity entity);
	
	default CityEntity getById(int id)
	{
		return null;
	}
	
	default void updatePopulationById(int newPop,int id)
	{
	
	}
	
	default void deleteById(int id)
	{
		
	}
}
