package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.MedicineDAO;
import com.xworkz.tour.dao.MedicineDAOImpl;
import com.xworkz.tour.entity.MedicineEntity;

public class MedicineRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//MedicineEntity entity = new MedicineEntity(1,"Dolo 650","Appollo","01-08-2021","05-05-2023","Fever",250);
		//MedicineEntity entity1 = new MedicineEntity(2,"Azithral 500","Medplus","11-07-2021","05-05-2024","Throat Infection",250);
		MedicineEntity entity2 = new MedicineEntity(3,"Augmentin","Durga","07-05-2020","07-06-2025","Cold",100);
		MedicineEntity entity3 = new MedicineEntity(4,"Allegra 120","Ganesh","25-05-2017","32-09-2024","Allergy",80);
		MedicineEntity entity4 = new MedicineEntity(5,"Allex Syrup","Credo","16-09-2020","15-05-2023","Cough",120);
		MedicineEntity entity5 = new MedicineEntity(6,"Aciloc","Medplus","09-08-2021","19-05-2025","Cardila",36);
		MedicineEntity entity6 = new MedicineEntity(7,"Annovate Cream","Vinayaka","01-08-2021","05-05-2023","Wound",122);
		MedicineEntity entity7 = new MedicineEntity(8,"Betnesol","Krishna","07-03-2019","06-09-2023","Atritis",128);
		MedicineEntity entity8 = new MedicineEntity(9,"Brufen","Appollo","02-08-2021","06-05-2023","Cystisis",150);
		MedicineEntity entity9 = new MedicineEntity(10,"Betnovate","Medplus","03-06-2020","07-12-2025","Acne",270);
		MedicineEntity entity10 = new MedicineEntity(12,"Cheston","Venkateshwara","04-01-2022","05-05-20234","fibrosis",405);
		MedicineEntity entity12 = new MedicineEntity(13,"Cefix","Appollo","01-08-2021","05-05-2023","Dry Mouth",250);
		MedicineEntity entity13 = new MedicineEntity(14,"Calpol","Vivas","06-07-2021","06-06-2023","Dental absess",30);
		MedicineEntity entity14 = new MedicineEntity(15,"Cypon Syrup","Appollo","06-07-2021","12-05-2024","Epilepsy",20);
		MedicineEntity entity15 = new MedicineEntity(16,"Dexona","RR Medicals","29-04-2020","05-09-2024","Eye sour",70);
		MedicineEntity entity16 = new MedicineEntity(17,"Deriphyllin","Manipal","09-07-2021","09-05-2023","Fever",90);
		MedicineEntity entity17= new MedicineEntity(18,"drotin","Chaithanya Pharma","11-11-2021","23-07-2023","Flu",185);
		MedicineEntity entity18 = new MedicineEntity(19,"Duonase","Sri Laxmi Medcare","09-08-2021","15-08-2023","Nose block",25);
		MedicineEntity entity19 = new MedicineEntity(20,"Evion","Karnataka ","27-08-2021","05-05-2023","Gastric",27);
		MedicineEntity entity20 = new MedicineEntity(21,"Enzomac","Appanna","19-12-2020","05-08-2024","Hepatitis A",140);
		MedicineEntity entity21 = new MedicineEntity(22,"Pantop","Appollo","19-08-2021","05-09-2023","Headache and neck pain",35);
		MedicineEntity entity22 = new MedicineEntity(23,"Perinorm","Ganesh","16-09-2021","12-07-2026","Indigestion",25);
		MedicineEntity entity23 = new MedicineEntity(24,"Rantac","Krishna","18-08-2022","06-07-2024","Cold",180);
		MedicineEntity entity24 = new MedicineEntity(25,"Neuron","Medplus","15-09-2021","07-08-2025","nerve pain",29);
		MedicineEntity entity25 = new MedicineEntity(26,"Relent plus","Civil","09-08-2021","09-05-2023","Acne",120);
		MedicineEntity entity26 = new MedicineEntity(27,"Aloclyn plus","Appollo","06-08-2021","05-05-2023","Pimples",80);
		MedicineEntity entity27 = new MedicineEntity(28,"Nexito plus","Vivas","29-08-2021","08-07-2024","Leg cramps",125);
		MedicineEntity entity28 = new MedicineEntity(29,"Nicip","Modhi Care","06-08-2021","25-06-2025","Sinus",120);
		MedicineEntity entity29 = new MedicineEntity(30,"Solvin","Appollo","17-09-2020","06-09-2024","Cold",25);
		MedicineEntity entity30 = new MedicineEntity(31,"Signoflam","Balaji","22-09-2020","08-08-2025","Sinus",85);
		MedicineEntity entity31 = new MedicineEntity(32,"Sumo Cold","Vivekananda","12-09-2019","15-05-2024","Cold",200);
		MedicineEntity entity32 = new MedicineEntity(33,"Stugeron","Durga","18-10-2021","09-10-2024","Diabetes",190);
		MedicineEntity entity33 = new MedicineEntity(34,"Wikoryl","RR","01-08-2021","05-05-2023","BP",28);
		MedicineEntity entity34 = new MedicineEntity(35,"Welminic","Shastry","12-08-2020","09-06-2024","Migrin",80);
		MedicineEntity entity35 = new MedicineEntity(36,"Paracetomol","Appollo","01-08-2021","05-05-2023","Fever",250);
		List<MedicineEntity> list=new ArrayList<MedicineEntity>();
		MedicineEntity entityy=null;
		for(int i=90;i<120;i++)
		{
			 entityy = new MedicineEntity(i,"Paracetomol","Appollo","01-08-2021","05-05-2023","Fever",250);
			 list.add(entityy);
			
		}
			
		
		
			MedicineDAO dao=new MedicineDAOImpl();
        
          //  list.add(entity1);
           /* list.add(entity2);
            list.add(entity3);
            list.add(entity4);
            list.add(entity5);
            list.add(entity6);
            list.add(entity7);
            list.add(entity8);
            list.add(entity9);
            list.add(entity10);
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
            list.add(entity35);*/
            
          list.add(entityy);
          
          dao.putAll(list);
            
	}

}
