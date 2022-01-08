package com.xworkz.data_company.dao;


import com.xworkz.data_company.entity.CountryEntity;

public interface CountryDAO {
	void create(CountryEntity entity);
	
	default CountryEntity getById(int id)
	{
		return null;
	}
	
	default void updateNameById(String country,int id)
	{
	
	}
	
	default void deleteById(int id)
	{
		
	}
}
