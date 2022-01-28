package com.xworkz.vendor.service;

import com.xworkz.vendor.dao.VendorDAO;
import com.xworkz.vendor.entity.VendorEntity;

public class VendorServiceImpl implements VendorService {

	private VendorDAO dao;

	public VendorServiceImpl(VendorDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validateAndSave(VendorEntity entity) {
		boolean valid = false;

		if (entity.getName() != null && entity.getName().length() >= 5 && entity.getName().length() <= 30) {
			valid = true;

		} else {
			System.out.println("Invalid name");
			valid = false;
			return valid;
		}

		if (entity.getEmail() != null && entity.getEmail().length() >= 15 && entity.getEmail().length() <= 30
				&& entity.getEmail().contains("@") && entity.getEmail().endsWith(".com")
				|| entity.getEmail().endsWith(".in") || entity.getEmail().endsWith(".org")) {
			valid = true;

		} else {
			System.out.println("invalid email id");
			valid = false;
			return valid;
		}

		if (entity.getLoginName() != null && entity.getLoginName().length() >= 8
				&& entity.getLoginName().length() <= 12) {
			valid = true;
		} else {
			System.out.println("invalid login id");
			valid = false;
			return valid;
		}

		if (entity.getPassword() != null && entity.getPassword().length() >= 5 && entity.getPassword().length() <= 15) {
			valid = true;
		} else {
			System.out.println("Invalid password");
			valid = false;
			return valid;
		}

		if (entity.getAddress() != null && entity.getAddress().length() >= 30 && entity.getAddress().length() <= 100) {
			valid = true;
		} else {
			System.out.println("invalid address");
			valid = false;
			return valid;
		}

		if (entity.getGstNo().length() == 13) {
			valid = true;
		} else {
			System.out.println("invalid gst no");
			valid = false;
			return valid;
		}

		if (entity.getCreatedBy() != null && entity.getCreatedBy().length() >= 5
				&& entity.getCreatedBy().length() <= 30) {
			valid = true;
		} else {
			System.out.println("invalid createdBy name");
			valid = false;
			return valid;
		}
		if (entity.getCreatedAt() != null) {
			valid = true;
		} else {
			System.out.println("invalid createdBy name");
			valid = false;
			return valid;
		}

		if (valid) {
			dao.save(entity);
			valid = true;
			return true;
		}

		return false;

	}

	public boolean validateAndLogin(String login, String password) {
		boolean valid = false;
		if (login != null && login.length() >= 8 && login.length() <= 12) {
			valid = true;
		} else {
			System.out.println("invalid login id");
			valid = false;
			return valid;
		}
		if (password != null && password.length() >= 5 && password.length() <= 15) {
			valid = true;
		} else {
			System.out.println("wrong password");
			valid = false;
			return valid;
		}
		if (valid) {
			valid=dao.findLogin(login, password);
			return valid;
		}
		return false;

	}
	
	public void validateAndChangePassword(String email,String newPassword)
	{
		boolean valid=false;
		if(email!=null && email.length()>=15 && email.length()<=30)
		{
			valid=true;
			if(valid)
			{
				boolean val=dao.findByEmail(email);
				if(val)
				{
					dao.updatePasswordByEmail(email, newPassword);
					valid=true;
				}
			}
		}
		else
		{
			valid=false;
		}
	}


}
