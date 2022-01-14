package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.MedicineEntity;

public interface MedicineDAO {
void put(MedicineEntity entity);
default void putAll(List<MedicineEntity> entities)
{
	
}
}
