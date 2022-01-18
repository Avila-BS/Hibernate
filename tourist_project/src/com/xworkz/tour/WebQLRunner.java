package com.xworkz.tour;

import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.dao.WebsiteDAOImpl;
import com.xworkz.tour.entity.WebsiteEntity;

public class WebQLRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		
		WebsiteEntity en=dao.getByName();
		
		System.out.println(en);
		
		WebsiteEntity url=dao.getByLikeURL();
		System.out.println(url);
		
		WebsiteEntity max=dao.getByMaxSince();
		System.out.println(max);
		
		WebsiteEntity min=dao.getByMinSince();
		System.out.println(min);
		
		WebsiteEntity secondMin=dao.getBySecondMinSince();
		System.out.println(secondMin);
		
		WebsiteEntity secondMax=dao.getBySecondMaxSince();
		System.out.println(secondMax);
		
		
		
	}

}
