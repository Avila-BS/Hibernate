package com.xworkz.data_company;

import com.xworkz.data_company.dao.StateDAO;
import com.xworkz.data_company.dao.StateDAOImp;
import com.xworkz.data_company.entity.StateEntity;

public class StateStarter {

	public static void main(String[] args) {
		
		/*StateEntity entity1=new StateEntity(1,"Karnataka",31,"Banglore");
		StateEntity entity2=new StateEntity(2,"Tamil Nadu",25,"Chennai");
		StateEntity entity3=new StateEntity(3,"Punjab",22,"Chandigarh");
		StateEntity entity4=new StateEntity(4,"Jharkhand",25,"Ranchi");
		StateEntity entity5=new StateEntity(5,"Kerala",27,"Thiruvanthapuram");
		*/
		
		StateDAO dao=new StateDAOImp();
		
		//dao.create(entity1);
		//dao.create(entity2);
		//dao.create(entity3);
		//dao.create(entity4);
		//dao.create(entity5);
		
		//StateEntity res=dao.getById(5);
		//System.out.println(res);
		
		//dao.updateDistrictsById(22, 5);
		
		dao.deleteById(2);

	}

}
