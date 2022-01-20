package com.xworkz.product.dao;

import java.util.List;

import com.xworkz.product.entity.ProductEntity;

public interface ProductDAO {
 void save(ProductEntity entity);
 void saveAll(List<ProductEntity> entities);
 List<ProductEntity> getAll();
 List<ProductEntity> getByPriceGreaterThan(double price);
 List<ProductEntity> getByPriceLesserThan(double price);
 ProductEntity getByNameAndId(String name,int id);
 double getMaxPrice();
 double getTotalPrice();
 List<ProductEntity> getByNameLike(String name);
 List<Integer> getQuantityByName(String name);
 List<Object[]> getQuantityAndPriceByName(String name);
 Object[] getQuantityAndPriceByNameAndId(String name,int id);
 List<ProductEntity> getByBrand(String brand);
 List<String> getBrandbyName(String name);
 List<Object[]> getNameAndPrice();
 List<Object[]> getNameAndPriceByBrand(String brand);
 
}
