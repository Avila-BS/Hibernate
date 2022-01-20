package com.xworkz.product.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
@Table(name="product_details")
@NamedQueries({
	@NamedQuery(name="getAll",query="select product from ProductEntity product"),
	@NamedQuery(name="getByPriceGreaterThan",query="select pro from ProductEntity pro where pro.price>:pric"),
	@NamedQuery(name="getByPriceLesserThan",query="select pro from ProductEntity pro where pro.price<:cost"),
	@NamedQuery(name="getByNameAndId",query="select pro from ProductEntity pro where pro.name=:nm and pro.id=:sl"),
	@NamedQuery(name="getMaxPrice",query="select max(pro.price) from ProductEntity pro"),
	@NamedQuery(name="getTotalPrice",query="select sum(pro.price) from ProductEntity pro"),
	//@NamedQuery(name="getByNameLike",query="select pro from ProductEntity pro where pro.name like :search+'%'")
	@NamedQuery(name="getQuantityByName",query="select pro.quantity from ProductEntity pro where pro.name=:namee"),
	@NamedQuery(name="getQuantityAndPriceByName",query="select pro.quantity,pro.price from ProductEntity pro where pro.name=:nam"),
	@NamedQuery(name="getQuantityAndPriceByNameAndId",query="select pro.quantity,pro.price from ProductEntity pro where pro.name=:nam and pro.id=:i"),
	@NamedQuery(name="getByBrand",query="select pro from ProductEntity pro where pro.brand=:br"),
	@NamedQuery(name="getBrandbyName",query="select pro.brand from ProductEntity pro where pro.name=:nme"),
	@NamedQuery(name="getNameAndPrice",query="select pro.name,pro.price from ProductEntity pro"),
	@NamedQuery(name="getNameAndPriceByBrand",query="select pro.name,pro.price from ProductEntity pro where pro.brand=:brnd")
	
})
public class ProductEntity implements Serializable {
	@Id
    @Column(name="p_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_quantity")
	private int quantity;
	@Column(name="p_brand")
	private String brand;
	@Column(name="p_price")
	private double price;
	@Column(name="p_rating")
	private int rating;


	public ProductEntity(String name, int quantity, String brand, double price, int rating) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}



}
