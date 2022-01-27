package com.xworkz.vendor;

import java.time.LocalDateTime;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.dao.VendorDAOImpl;
import com.xworkz.vendor.entity.VendorEntity;
import com.xworkz.vendor.service.VendorService;
import com.xworkz.vendor.service.VendorServiceImpl;

public class VendorStarter {

	public static void main(String[] args) {
	VendorEntity entity = new VendorEntity("Jaydev","jaydev12creations@gmail.com","Jaydeva N","Ka01gdf579f","no 89,2nd cross,btm 2nd stage, Banglore","A12V67B89GH65","Namratha",LocalDateTime.now());
	VendorDAO dao=new VendorDAOImpl();
	
	VendorService service = new VendorServiceImpl(dao);
	service.validateAndSave(entity);
	
	VendorEntity entity1 = new VendorEntity("Nirmala","nirmala12creations@gmail.in","Nirmala K S","Ka0fshhi658f","no 92,3rdcross,Banshankari,Banglore","B12V67B89GH72","Nirmala",LocalDateTime.now());
	VendorEntity entity2 = new VendorEntity("Paartha","paartha12cons@gmail.in","Paartha S","GH@tyshhi658f","no 42,Rajajinagar 2nd stage, Banglore","C15V67B89GH78","Sanjay",LocalDateTime.now());
	VendorEntity entity3 = new VendorEntity("Mounavathy","mouna15cons@gmail.org","Mounavathi","hj8h@tyshhi658f","no 13,Nelmangala 2nd stage, Banglore","D15V67B89GH56","Chandan",LocalDateTime.now());
	VendorEntity entity4 = new VendorEntity("Chandan Prasad","chandan15cons@gmail.org","Chandan P","hj8h@tgh78j658f","no 56,Vijay Nagara,3rd stage,Mysuru","E19V67B89GH22","Chandana",LocalDateTime.now());
	
service.validateAndSave(entity1);
service.validateAndSave(entity2);
service.validateAndSave(entity3);
service.validateAndSave(entity4);

	}

}
