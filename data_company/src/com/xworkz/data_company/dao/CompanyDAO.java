package com.xworkz.data_company.dao;


import com.xworkz.data_company.entity.CompanyEntity;

public interface CompanyDAO {
void create(CompanyEntity entity);

default CompanyEntity getById(int id)
{
	return null;
}

default void updateDomainById(String newDomain,int id)
{

}

default void deleteById(int id)
{
	
}
}
