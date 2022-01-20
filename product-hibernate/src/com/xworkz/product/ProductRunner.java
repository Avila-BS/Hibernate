package com.xworkz.product;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.product.dao.ProductDAO;
import com.xworkz.product.dao.ProductDAOImpl;
import com.xworkz.product.entity.ProductEntity;

public class ProductRunner {

	public static void main(String[] args) {
ProductEntity entity=new ProductEntity("Laptop",1,"HP",52000.00d,5);

ProductDAO dao=new ProductDAOImpl();
dao.save(entity);
ProductEntity entity1=new ProductEntity("Iron box",2,"Philips",3000.00d,4);
ProductEntity entity2=new ProductEntity("Television",3,"Samsung",54000.00d,5);
ProductEntity entity3=new ProductEntity("Trolly",1,"WildsCraft",8000.00d,5);
ProductEntity entity4=new ProductEntity("Mobile",1,"Apple",70000.00d,5);
ProductEntity entity5=new ProductEntity("Oven",1,"Pigeon",15000.00d,3);
ProductEntity entity6=new ProductEntity("Chocolate",5,"DairyMilk",500.00d,5);
ProductEntity entity7=new ProductEntity("Book",6,"Students",540.00d,4);
ProductEntity entity8=new ProductEntity("Pen",10,"Pin Point",100.00d,5);
ProductEntity entity9=new ProductEntity("Straightner",1,"Philips",2000.00d,3);
ProductEntity entity10=new ProductEntity("Saree",3,"Mysore silk",9000.00d,4);
ProductEntity entity11=new ProductEntity("Champakali",4,"Mahalakshmi",120.00d,5);
ProductEntity entity12=new ProductEntity("Sofa",1,"Royal Oak",60000.00d,5);
ProductEntity entity13=new ProductEntity("Bluetooth",2,"Boat",40000.00d,4);
ProductEntity entity14=new ProductEntity("Nail Polish",3,"Nykaa",180.00d,3);
ProductEntity entity15=new ProductEntity("Jean",2,"Pepe Jeans",4000.00d,5);
ProductEntity entity16=new ProductEntity("Stove",1,"Pigeon",20000.00d,4);
ProductEntity entity17=new ProductEntity("Shoes",1,"Puma",3500.00d,4);
ProductEntity entity18=new ProductEntity("Dolo 650",10,"Sun Pharmaceutical",30.00d,5);
ProductEntity entity19=new ProductEntity("Biscuits",5,"Britania",150.00d,4);
ProductEntity entity20=new ProductEntity("Mobile",1,"one +",35000.00d,5);

List<ProductEntity> list=new ArrayList<ProductEntity>();

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

dao.saveAll(list);

List<ProductEntity> get=dao.getAll();
for(ProductEntity all:get)
{
	System.out.println(all);
}
 
List<ProductEntity> check=dao.getByPriceGreaterThan(25000.00d);
for(ProductEntity pri:check)
{
	System.out.println(pri);
}

List<ProductEntity> low=dao.getByPriceLesserThan(10000.00d);
for(ProductEntity less:low)
{
	System.out.println(less);
}

ProductEntity id=dao.getByNameAndId("Straightner", 31);
System.out.println(id);

double max=dao.getMaxPrice();
System.out.println(max);

double sum=dao.getTotalPrice();
System.out.println("Total Price="+sum);

List<ProductEntity> like=dao.getByNameLike("Mob");
for(ProductEntity sim:like)
{
	System.out.println(sim);
}

List<Integer> quant=dao.getQuantityByName("Television");
for(int find:quant)
{
	System.out.println(find);
}

List<Object[]> obj=dao.getQuantityAndPriceByName("Saree");
for(Object[] fit:obj)
{
	for(int i=0;i<=1;i++)
	{
		System.out.println(fit);
		System.out.println(fit[i]);
	}
}

Object[] res=dao.getQuantityAndPriceByNameAndId("Laptop", 1);

System.out.println(res[0]);
System.out.println(res[1]);


List<ProductEntity> li=dao.getByBrand("Philips");
for(ProductEntity pr:li)
{
	System.out.println(pr);
}

List<String> str=dao.getBrandbyName("Bluetooth");
for(String key:str)
{
	System.out.println(key);
}

List<Object[]> arr=dao.getNameAndPrice();
for(Object[] ob:arr)
{
	for(int i=0;i<=1;i++)
	{
		System.out.println(ob);
		System.out.println(ob[i]);
	}
}

List<Object[]> lock=dao.getNameAndPriceByBrand("Puma");
for(Object[] one:lock)
{
	for(int i=0;i<=1;i++)
	{
		System.out.println(one);
		System.out.println(one[i]);
	}
}






	}

}
