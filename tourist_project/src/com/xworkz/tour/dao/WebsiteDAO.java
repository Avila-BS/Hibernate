package com.xworkz.tour.dao;

import com.xworkz.tour.entity.WebsiteEntity;

public interface WebsiteDAO {
	void add(WebsiteEntity entity);
	WebsiteEntity getByName();
	WebsiteEntity getByLikeURL();
	WebsiteEntity getByMaxSince();
	WebsiteEntity getByMinSince();
	WebsiteEntity getBySecondMinSince();
	WebsiteEntity getBySecondMaxSince();
	
	
}
