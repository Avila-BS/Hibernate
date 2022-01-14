package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.AirportDAO;
import com.xworkz.tour.dao.AirportDAOImpl;
import com.xworkz.tour.entity.AirportEntity;

public class AirportRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//AirportEntity entity=new AirportEntity(1,"Emirates","1S456t8","India","Canada",75000.00d,200);
		AirportEntity entity1=new AirportEntity(2,"Indira Gandhi IA","1r656t8","India","England",79000.00d,500);
		AirportEntity entity2=new AirportEntity(3,"Rajiv Gandhi","1gs789t8","Russia","India",75000.00d,200);
		AirportEntity entity3=new AirportEntity(4,"Cochin","1gh86vj8","Mumbai","Chennai",8000.00d,400);
		AirportEntity entity4=new AirportEntity(5,"Chatrapati Shivaji","1S498t8","US","Canada",56000.00d,800);
		AirportEntity entity5=new AirportEntity(6,"Kempegowda IA","5fg76t8","China","Srilanka",19000.00d,250);
		AirportEntity entity6=new AirportEntity(7,"Dabolim","1Ssc8t8","Dubai","India",25000.00d,300);
		AirportEntity entity7=new AirportEntity(8,"Trivandrum","1S4ghht8","TamilNadu","Italy",65000.00d,700);
		AirportEntity entity8=new AirportEntity(9,"Lokpriya Gopinath","5fh8t8","India","China",22000.00d,1000);
		AirportEntity entity9=new AirportEntity(10,"Sardar Vallabhai Patel","1S456t8","India","Canada",47000.00d,1300);
		AirportEntity entity10=new AirportEntity(11,"Calicut","1Sgh86t8","Calicut","US",26000.00d,4200);
		AirportEntity entity11=new AirportEntity(12,"Jaipur IA","7g456t8","India","Paris",57000.00d,900);
		AirportEntity entity12=new AirportEntity(13,"Chaudhry Charan Singh","7gh856t8","Pune","Egypt",4300.00d,677);
		AirportEntity entity13=new AirportEntity(14,"Coimbatore IA","9gh56t8","Coimbatore","Thyland",2300.00d,1500);
		AirportEntity entity14=new AirportEntity(15,"Biju Patnaik IA","4fg6t8","Chennai","NewZeland",64000.00d,2500);
		AirportEntity entity15=new AirportEntity(16,"Manglore IA","7gh756t8","Manglore","Mumbai",9500.00d,800);
		AirportEntity entity16=new AirportEntity(17,"Pune IA","34fg6t8","Pune","Chennai",16000.00d,800);
		AirportEntity entity17=new AirportEntity(18,"Lal Bahadur Shastry","78vg7t8","Banglore","Delhi",12000.00d,650);
		AirportEntity entity18=new AirportEntity(19,"Tiruchirapalli IA","1S56fg8","Kerala","Agra",9000.00d,800);
		AirportEntity entity19=new AirportEntity(20,"Chandigarh IA","17gh7t8","Chandigarh","Russia",86000.00d,1700);
		AirportEntity entity20=new AirportEntity(21,"Babasaheb Ambedkar IA","4fg7hj","India","Australia",58000.00d,2500);
		AirportEntity entity21=new AirportEntity(22,"Vishakapatnam IA","1S456t8","Vishakapatna","Pakistan",30000.00d,600);
		AirportEntity entity22=new AirportEntity(23,"Imphal IA","78gh78","Dubai","India",45000.00d,600);
		AirportEntity entity23=new AirportEntity(24,"Holkar IA","1Sgh78","India","Canada",75000.00d,200);
		AirportEntity entity24=new AirportEntity(25,"Sikkandharbhad IA","1S456t8","India","Australia",65000.00d,2300);
		AirportEntity entity25=new AirportEntity(26,"Biju Patnaik IA","4vbj9t8","Chennai","China",35000.00d,2500);
		AirportEntity entity26=new AirportEntity(27,"Vishakapatnam ","1S456t8","India","Canada",75000.00d,200);
		AirportEntity entity27=new AirportEntity(28,"Chaudhry Charan Singh","1S456t8","India","Japan",75000.00d,200);
		AirportEntity entity28=new AirportEntity(29,"Lokpriya Gopinath","vbh8123","India","Korea",75000.00d,679);
		AirportEntity entity29=new AirportEntity(30,"Dabolim","1S89bj","India","England",69000.00d,890);
		AirportEntity entity30=new AirportEntity(31,"Tiruchirapalli IA","fg67g8","India","Thyland",35000.00d,700);
		AirportEntity entity31=new AirportEntity(32,"Kempegowda IA","1S456t8","Banglore","US",75000.00d,200);
		AirportEntity entity32=new AirportEntity(33,"Cochin","6gh89g","Cochin","West Indies",75000.00d,2560);
		AirportEntity entity33=new AirportEntity(34,"Sardar Vallabhai Patel","1Scgh8","India","Canada",42000.00d,2890);
		AirportEntity entity34=new AirportEntity(35,"Babasaheb Ambedkar IA","4fg7hj","India","Australia",58000.00d,2500);
		AirportEntity entity35=new AirportEntity(36,"Tiruchirapalli IA","1S56fg8","Kerala","Agra",9000.00d,800);
		AirportEntity entity36=new AirportEntity(37,"Pune IA","34fg6t8","Pune","Chennai",16000.00d,800);
		AirportEntity entity37=new AirportEntity(38,"Emirates","1S456t8","India","Canada",75000.00d,200);
		AirportEntity entity38=new AirportEntity(39,"Chaudhry Charan Singh","7gh856t8","Pune","Egypt",4300.00d,677);
		AirportEntity entity39=new AirportEntity(40,"Cochin","1gh86vj8","Mumbai","Chennai",8000.00d,400);
		AirportEntity entity40=new AirportEntity(41,"Chatrapati Shivaji","1S498t8","US","Canada",56000.00d,800);	
		AirportEntity entity41=new AirportEntity(42,"Tiruchirapalli IA","1S56fg8","Kerala","Agra",9000.00d,800);
		AirportEntity entity42=new AirportEntity(43,"Chandigarh IA","17gh7t8","Chandigarh","Russia",86000.00d,1700);
		AirportEntity entity43=new AirportEntity(44,"Babasaheb Ambedkar IA","4fg7hj","India","Australia",58000.00d,2500);
		AirportEntity entity44=new AirportEntity(45,"Vishakapatnam IA","1S456t8","Vishakapatna","Pakistan",30000.00d,600);
		AirportEntity entity45=new AirportEntity(46,"Imphal IA","78gh78","Dubai","India",45000.00d,600);
		AirportEntity entity46=new AirportEntity(47,"Holkar IA","1Sgh78","India","Canada",75000.00d,200);
		AirportEntity entity47=new AirportEntity(48,"Sikkandharbhad IA","1S456t8","India","Australia",65000.00d,2300);
		
		
		
		AirportDAO dao=new AirportDAOImpl();
		
		List<AirportEntity> list=new ArrayList<AirportEntity>();
		list.add(entity1);
		list.add(entity2);
		list.add(entity3);
		list.add(entity4);
		list.add(entity5);
		list.add(entity6);
		list.add(entity7);
		list.add(entity8);
		list.add(entity9);
		list.add(entity10);
		list.add(entity11);
		list.add(entity12);
		list.add(entity13);
		list.add(entity14);
		list.add(entity15);
		list.add(entity16);
		list.add(entity17);
		list.add(entity18);
		list.add(entity19);
		list.add(entity20);
		list.add(entity21);
		list.add(entity22);
		list.add(entity23);
		list.add(entity24);
		list.add(entity25);
		list.add(entity26);
		list.add(entity27);
		list.add(entity28);
		list.add(entity29);
		list.add(entity30);
		list.add(entity31);
		list.add(entity32);
		list.add(entity33);
		list.add(entity34);
		list.add(entity35);
		list.add(entity36);
		list.add(entity37);
		list.add(entity38);
		list.add(entity39);
		list.add(entity40);
		list.add(entity41);
		list.add(entity42);
		list.add(entity43);
		list.add(entity44);
		list.add(entity45);
		list.add(entity46);
		list.add(entity47);
		
		
	dao.putAll(list);
	}

}
