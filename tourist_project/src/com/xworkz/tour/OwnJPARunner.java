package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;

import com.xworkz.singleton.EMFUtil;

public class OwnJPARunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entity=EMFUtil.getEntityManagerFactory();
		System.out.println(entity);
	}

}
