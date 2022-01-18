package com.xworkz.tour;

import com.xworkz.tour.dao.WebsiteDAO;
import com.xworkz.tour.dao.WebsiteDAOImpl;
import com.xworkz.tour.entity.WebsiteEntity;

public class WebsiteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebsiteEntity entity1=new WebsiteEntity("Google","https.//workspace.google.com",1998,".com","Larry Page Sergey Brin");
		WebsiteEntity entity2=new WebsiteEntity("VTU","vtu.ac.in",2022,".in","Karisidappa");
		WebsiteEntity entity3=new WebsiteEntity("Instagram","www.instagram.com",2012,".com","Meta");
		WebsiteEntity entity4=new WebsiteEntity("Karnataka Government","www.karnataka.gov.in",2016,".in","Bommai");
		WebsiteEntity entity5=new WebsiteEntity("GoDaddy","www.in.godaddy.com",2002,".com","Sam");
		WebsiteEntity entity6=new WebsiteEntity("Yahoo","www.yahoo.com",2012,".com","Appollo Global");
		WebsiteEntity entity7=new WebsiteEntity("Youtube","www.youtube.com",2002,".com","Chad Harley");
		WebsiteEntity entity8=new WebsiteEntity("Wikipedia","en.wikipedia.org",1992,".org","Jimmy wales");
		WebsiteEntity entity9=new WebsiteEntity("Microsoft","www.microsoft.com",2014,".com","Bill Gates");
		WebsiteEntity entity10=new WebsiteEntity("Linkedin","www.linkedin.com",2013,".com","Redid Hoffman");
		WebsiteEntity entity11=new WebsiteEntity("PlayStore","play.google.com",2016,".com","Pichai");
		WebsiteEntity entity12=new WebsiteEntity("Apple","www.apple.com",2009,".com","Steve Jobs");
		WebsiteEntity entity13=new WebsiteEntity("Bloggers","www.blogger.com",2019,".com","Evan Williams");
		WebsiteEntity entity14=new WebsiteEntity("Google Drive","docs.google.com",2018,".com","Jonathan");
		WebsiteEntity entity15=new WebsiteEntity("WordPress","www.wordpress.org",2015,".org","Matt Mullenweg");
		WebsiteEntity entity16=new WebsiteEntity("NIEIT","www.nieit.edu",2012,".edu","Bansilal");
		WebsiteEntity entity17=new WebsiteEntity("Slideshare","www.slideshare.net",2009,".net","Sinhen");
		WebsiteEntity entity18=new WebsiteEntity("AcademicEarth","www.academicearth.org",2017,".org","Andrena");
		WebsiteEntity entity19=new WebsiteEntity("Coursera","www.coursera.org",2020,".org","Aliana");
		WebsiteEntity entity20=new WebsiteEntity("Alaska University","www.alaska.edu",1999,".edu","Alaska");
		WebsiteEntity entity21=new WebsiteEntity("Reva University","www.reva.edu",2021,".edu","Alaska");
		
		WebsiteDAO dao=new WebsiteDAOImpl();
		/*dao.add(entity1);
		dao.add(entity2);
		dao.add(entity3);
		dao.add(entity4);
		dao.add(entity5);
		dao.add(entity6);
		dao.add(entity7);
		dao.add(entity8);
		dao.add(entity9);
		dao.add(entity10);
		dao.add(entity11);
		dao.add(entity12);
		dao.add(entity13);
		dao.add(entity14);
		dao.add(entity15);
		dao.add(entity16);
		dao.add(entity17);
		dao.add(entity18);
		dao.add(entity19);
		dao.add(entity20);*/
		dao.add(entity21);
		

	}

}
