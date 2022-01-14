package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.RailwayDAO;
import com.xworkz.tour.dao.RailwayDAOImpl;
import com.xworkz.tour.entity.RailwayStationEntity;

public class RailwayRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//RailwayStationEntity en=new RailwayStationEntity(1,"Shatabdhi express",6543,"Banglore","Delhi","Sleeper",12);
		RailwayStationEntity en1=new RailwayStationEntity(2,"Abada express",6545,"Bihar","Assam","AC",13);
		RailwayStationEntity en2=new RailwayStationEntity(3,"AbhayaPuri express",5468,"Punjab","Assam","Normal",14);
		RailwayStationEntity en3=new RailwayStationEntity(4,"Achalpur express",7865,"TamilNadu","UP","Sleeper",19);
		RailwayStationEntity en4=new RailwayStationEntity(5,"Adoni",8643,"Banglore","Delhi","Sitting",12);
		RailwayStationEntity en5=new RailwayStationEntity(6,"Badami express",7677,"Chattisgarh","Bihar","Non AC",18);
		RailwayStationEntity en6=new RailwayStationEntity(7,"Badarpur express",9867,"Jharkand","Assam","Second Class",25);
		RailwayStationEntity en7=new RailwayStationEntity(8,"Bagula Express",9822,"West Bengal","Madya Pradesh","First Class AC",34);
		RailwayStationEntity en8=new RailwayStationEntity(9,"Balangir express",9779,"Odisha","Maharashtra","Sleeper",35);
		RailwayStationEntity en9=new RailwayStationEntity(10,"Bansipur express",6543,"Utharkhand","Assam","LOcal",42);
		RailwayStationEntity en10=new RailwayStationEntity(11,"Chennai express",4656,"Banglore","Chennai","first class",56);
		RailwayStationEntity en11=new RailwayStationEntity(12,"Chakda express",6543,"Jharkhnad","Delhi","Non Sleeper",32);
		RailwayStationEntity en12=new RailwayStationEntity(13,"Chalal express",8474,"Banglore","Agra","Non AC",52);
		RailwayStationEntity en13=new RailwayStationEntity(14,"Chanduli express",3112,"Haryana","Rajasthan","AC",45);
		RailwayStationEntity en14=new RailwayStationEntity(15,"Chandrapur express",3333,"Punjab","Tamil Nadu","Sleeper",19);
		RailwayStationEntity en15=new RailwayStationEntity(16,"Charbagh express",2222,"Banglore","Chennai","Non Sleeper",32);
		RailwayStationEntity en16=new RailwayStationEntity(17,"Chembur express",1212,"Kerala","Tamil Nadu","Sleeper",14);
		RailwayStationEntity en17=new RailwayStationEntity(18,"Chetar express",6109,"Rajasthan","Delhi","sitting",43);
		RailwayStationEntity en18=new RailwayStationEntity(19,"Chattarpur  express",7676,"Jharkhand","Delhi","First Class",56);
		RailwayStationEntity en19=new RailwayStationEntity(20,"Chidambaram express",6533,"Chennai","Goa","Sleeper",25);
		RailwayStationEntity en20=new RailwayStationEntity(21,"Dabilpur express",5412,"Himachal Pradesh","Delhi","Sleeper",26);
		RailwayStationEntity en21=new RailwayStationEntity(22,"Dabra express",4312,"Chandigarh","Hariyana","Sleeper",27);
		RailwayStationEntity en22=new RailwayStationEntity(23,"Dagmagpur express",6087,"Banglore","Mumbai","AC",28);
		RailwayStationEntity en23=new RailwayStationEntity(24,"Dakaniya express",5621,"Shimla","Orissa","Sleeper",29);
		RailwayStationEntity en24=new RailwayStationEntity(25,"Dalmera express",9665,"Maddur","Tamilnadu","Sleeper",30);
		RailwayStationEntity en25=new RailwayStationEntity(26,"Dandpur express",4321,"Hyderabad","AndhraPradesh","Non Sleeper",31);
		RailwayStationEntity en26=new RailwayStationEntity(27,"Dappar express",4579,"Pune","Bangalore","AC",32);
		RailwayStationEntity en27=new RailwayStationEntity(28,"Dasna express",6123,"Jammu and Kashmir","Delhi","Sleeper",33);
		RailwayStationEntity en28=new RailwayStationEntity(29,"Dayalpur express",6983,"Bangalore","Maharastra","Sleeper",34);
		RailwayStationEntity en29=new RailwayStationEntity(30,"datia express",6466,"Noida","Telangana","Non Sleeper",35);
		RailwayStationEntity en30=new RailwayStationEntity(31,"Elluru express",7509,"Kerala","Mumbai","Sleeper",36);
		RailwayStationEntity en31=new RailwayStationEntity(32,"Etmadpur express",7654,"Arunachal Pradesh","Goa","Sleeper",37);
		RailwayStationEntity en32=new RailwayStationEntity(33,"Erode express",8883,"Assam","Bihar","Sleeper",38);
		RailwayStationEntity en33=new RailwayStationEntity(34,"Eravipuram express",5667,"Dispur","Delhi","Sleeper",39);
		RailwayStationEntity en34=new RailwayStationEntity(35,"Ennore express",5321,"Hariyana","Itanagar","Sleeper",40);
		RailwayStationEntity en35=new RailwayStationEntity(36,"Ernakulam express",6655,"Gujarat","Delhi","Sleeper",56);
		RailwayStationEntity en36=new RailwayStationEntity(37,"Ettakot express",7777,"Banglore","Punjab","AC",57);
		RailwayStationEntity en37=new RailwayStationEntity(38,"Faizabad express",4556,"UttarPradesh","Delhi","Sleeper",58);
		RailwayStationEntity en38=new RailwayStationEntity(39,"Falna express",9008,"Hariyana","Goa","Sleeper",59);
		RailwayStationEntity en39=new RailwayStationEntity(40,"Faridkot express",3110,"Panaji","Delhi","Sleeper",71);
		RailwayStationEntity en40=new RailwayStationEntity(41,"Fatehpur express",9008,"Arunachal Pradesh","Bihar","Sleeper",72);
		RailwayStationEntity en41=new RailwayStationEntity(42,"Firozabad express",5119,"Goa","Delhi","Sleeper",73);
		RailwayStationEntity en42=new RailwayStationEntity(43,"Firozpurexpress",8112,"Bihar","Delhi","Sleeper",74);
		RailwayStationEntity en43=new RailwayStationEntity(44,"Gacchipura express",2234,"Orissa","Pune","Sleeper",75);
		RailwayStationEntity en44=new RailwayStationEntity(45,"Gadag express",8654,"Rajasthan","Delhi","Sleeper",76);
		RailwayStationEntity en45=new RailwayStationEntity(46,"Gambhiri express",3344,"Banglore","Arunachal Pradesh","Sleeper",77);
		RailwayStationEntity en46=new RailwayStationEntity(47,"Gannaur express",9987,"Mumbai","Delhi","Sleeper",78);
		RailwayStationEntity en47=new RailwayStationEntity(48,"Gangapur express",6322,"Banglore","Meghalaya","Sleeper",15);
		RailwayStationEntity en48=new RailwayStationEntity(49,"Garhi express",4546,"Kerala","Maharastra","Sleeper",16);
		RailwayStationEntity en49=new RailwayStationEntity(50,"Gauripur express",8473,"Chattisgarh","Delhi","Sleeper",17);
		RailwayStationEntity en50=new RailwayStationEntity(51,"Ghanuli express",6464,"Panaji","UP","Sleeper",18);
		RailwayStationEntity en51=new RailwayStationEntity(52,"Gharaunda express",55656,"Banglore","Assam","Sleeper",19);
		RailwayStationEntity en52=new RailwayStationEntity(53,"Ghorpuri express",4656,"Dispur","Delhi","Sleeper",20);
		RailwayStationEntity en53=new RailwayStationEntity(54,"Godha express",2464,"Goa","Orissa","Sleeper",21);
		RailwayStationEntity en54=new RailwayStationEntity(55,"Habra express",9476,"UP","Tamilnadu","Sleeper",01);
		RailwayStationEntity en55=new RailwayStationEntity(56,"Haldaur express",3838,"Bhutan","Delhi","Sleeper",2);
		RailwayStationEntity en56=new RailwayStationEntity(57,"Hamira express",8575,"Banglore","Jharkhand","Sleeper",3);
		RailwayStationEntity en57=new RailwayStationEntity(58,"hapur express",4546,"Mysore","Delhi","Sleeper",4);
		RailwayStationEntity en58=new RailwayStationEntity(59,"Harwada express",84764,"Banglore","Dudhsagar","Sleeper",5);
		RailwayStationEntity en59=new RailwayStationEntity(60,"Haridwar express",5453,"Maharastra","Punjab","Sleeper",6);
		RailwayStationEntity en60=new RailwayStationEntity(61,"Jabalpur express",5433,"Mumbai","Delhi","Sleeper",7);
		RailwayStationEntity en61=new RailwayStationEntity(62,"Jagdalpur express",56546,"Pune","Delhi","Sleeper",8);
		RailwayStationEntity en62=new RailwayStationEntity(63,"Jaipur express",1274,"Banglore","Assam","Sleeper",9);
		RailwayStationEntity en63=new RailwayStationEntity(64,"Jaithari express",8846,"Mangalore","Delhi","Sleeper",10);
		RailwayStationEntity en64=new RailwayStationEntity(65,"Jakhim express",1534,"Banglore","Dispur","Sleeper",11);
		RailwayStationEntity en65=new RailwayStationEntity(66,"Jamalpur express",7659,"Dispur","Delhi","Sleeper",91);
		RailwayStationEntity en66=new RailwayStationEntity(67,"Kadur express",8776,"Punjab","Delhi","Sleeper",92);
		RailwayStationEntity en67=new RailwayStationEntity(68,"Kalamboli express",76778,"TN","Delhi","Sleeper",93);
		RailwayStationEntity en68=new RailwayStationEntity(69,"Kaliyanpur express",8975,"Dandeli","Hubli","AC",94);
		RailwayStationEntity en69=new RailwayStationEntity(70,"Kalka express",7888,"Punjab","Amritsar","Sleeper",95);
		RailwayStationEntity en70=new RailwayStationEntity(71,"Kamakhya express",6543,"Maharashtra","Chattisharh","Sleeper",96);
		RailwayStationEntity en71=new RailwayStationEntity(72,"Kampur express",7889,"Haryana","Kerala","Sleeper",97);
		RailwayStationEntity en72=new RailwayStationEntity(73,"Kankapura express",6743,"UP","Delhi","Sleeper",98);
		RailwayStationEntity en73=new RailwayStationEntity(74,"Kanpur express",5567,"UP","Jharkhand","ac",99);
		
		
		List<RailwayStationEntity> list=new ArrayList<RailwayStationEntity>();
		list.add(en1);
		list.add(en2);
		list.add(en3);
		list.add(en4);
		list.add(en5);
		list.add(en6);
		list.add(en7);
		list.add(en8);
		list.add(en9);
		list.add(en10);
		list.add(en11);
		list.add(en12);
		list.add(en13);
		list.add(en14);
		list.add(en15);
		list.add(en16);
		list.add(en17);
		list.add(en18);
		list.add(en19);
		list.add(en20);
		list.add(en21);
		list.add(en22);
		list.add(en23);
		list.add(en24);
		list.add(en25);
		list.add(en26);
		list.add(en27);
		list.add(en28);
		list.add(en29);
		list.add(en30);
		list.add(en31);
		list.add(en32);
		list.add(en33);
		list.add(en34);
		list.add(en35);
		list.add(en36);
		list.add(en37);
		list.add(en38);
		list.add(en39);
		list.add(en40);
		list.add(en41);
		list.add(en42);
		list.add(en43);
		list.add(en44);
		list.add(en45);
		list.add(en46);
		list.add(en47);
		list.add(en48);
		list.add(en49);
		list.add(en50);
		list.add(en51);
		list.add(en52);
		list.add(en53);
		list.add(en54);
		list.add(en55);
		list.add(en56);
		list.add(en57);
		list.add(en58);
		list.add(en59);
		list.add(en60);
		list.add(en61);
		list.add(en62);
		list.add(en63);
		list.add(en64);
		list.add(en65);
		list.add(en66);
		list.add(en67);
		list.add(en68);
		list.add(en69);
		list.add(en70);
		list.add(en71);
		list.add(en72);
		list.add(en73);
		
		
		
		
		
		RailwayDAO dao=new RailwayDAOImpl();
		
		dao.putAll(list);
		
		//dao.put(en);

	}

}
