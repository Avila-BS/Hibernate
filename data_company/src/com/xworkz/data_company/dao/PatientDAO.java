package com.xworkz.data_company.dao;


import com.xworkz.data_company.entity.PatientEntity;

public interface PatientDAO {
void create(PatientEntity entity);
default PatientEntity getById(int id)
{
	return null;
}

default void updateAgeById(int age,int id)
{

}

default void deleteById(int id)
{
	
}
}
