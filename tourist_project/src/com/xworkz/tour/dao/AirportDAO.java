package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.AirportEntity;

public interface AirportDAO {
void put(AirportEntity entity);
default void putAll(List<AirportEntity> entities)
{
	
}
}
