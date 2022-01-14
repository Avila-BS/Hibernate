package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.RailwayStationEntity;

public interface RailwayDAO {
	
	void put(RailwayStationEntity entity);
	default void putAll(List<RailwayStationEntity> entities)
	{
		
	}

}
