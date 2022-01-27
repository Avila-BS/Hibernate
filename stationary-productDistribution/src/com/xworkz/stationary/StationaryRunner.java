package com.xworkz.stationary;

import java.time.LocalDateTime;

import com.xworkz.stationary.dao.StationaryDAO;
import com.xworkz.stationary.dao.StationaryDAOImpl;
import com.xworkz.stationary.entity.StationaryEntity;

public class StationaryRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StationaryEntity dto=new StationaryEntity("Students World","Rathnakar","students12world@gmail.com",88617650l,95355363l,"Vikranth",700,52.00d,true,5.00d,true,"8.00 am","10.00 pm","Avila B.S",LocalDateTime.now());
StationaryDAO dao=new StationaryDAOImpl();

dao.save(dto);
	}

}
