package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {
	
	private VendorDAO dao;

	
	public VendorServiceImpl(VendorDAO dao)
	{
		this.dao=dao;
	}
	
	@Override
	public boolean validateAndSave(VendorEntity entity)
	{
		boolean valid=false;
		
		if(entity.getName() !=null && entity.getName().length() >=5 && entity.getName().length() <= 30)
		{
			valid=true;
			
		}
		else
		{
			System.out.println("Invalid name");
			valid=false;
			return valid;
		}
		
		if(entity.getEmail() != null && entity.getEmail().length()>= 15 && entity.getEmail().length() <=30 && entity.getEmail().contains("@") && entity.getEmail().endsWith(".com") || entity.getEmail().endsWith(".in") || entity.getEmail().endsWith(".org"))
		{
			valid = true;
			
		}
		else
		{
			System.out.println("invalid email id");
			valid=false;
			return valid;
		}
		
		if(entity.getLoginName() != null && entity.getLoginName().length() >=8 && entity.getLoginName().length()<=12)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid login id");
			valid=false;
			return valid;
		}
		
		if(entity.getPassword() !=null && entity.getPassword().length()>=5 && entity.getPassword().length()<=15 )
		{
			valid=true;
		}
		else
		{
			System.out.println("Invalid password");
			valid=false;
			return valid;
		}
		
		if(entity.getAddress() !=null && entity.getAddress().length()>=30 && entity.getAddress().length()<=100)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid address");
			valid=false;
			return valid;
		}
		
		if(entity.getGstNo().length()==13)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid gst no");
			valid=false;
			return valid;
		}
		
		if(entity.getCreatedBy()!=null && entity.getCreatedBy().length()>=5 && entity.getCreatedBy().length()<=30)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid createdBy name");
			valid=false;
			return valid;
		}
		if(entity.getCreatedAt()!=null)
		{
			valid=true;
		}
		else
		{
			System.out.println("invalid createdBy name");
			valid=false;
			return valid;
		}
		
		if(valid)
		{
			dao.save(entity);
			valid=true;
			return true;
		}
		
		return false;
			
	}

}
