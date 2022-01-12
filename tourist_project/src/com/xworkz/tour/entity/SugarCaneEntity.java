package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="sugarcane_info")
public class SugarCaneEntity implements Serializable {
	@Id
	@Column(name="s_id")
	private int s_id;
	@Column(name="s_production")
	private String production;
	@Column(name="s_cost")
	private double cost;
	@Column(name="sucrose_content")
	private double sucroseContent;
	@Column(name="s_product")
	private String product;
	
	
	public SugarCaneEntity() {
		super();
	}
	
	public SugarCaneEntity(int s_id, String production, double cost, double sucroseContent, String product) {
		super();
		this.s_id = s_id;
		this.production = production;
		this.cost = cost;
		this.sucroseContent = sucroseContent;
		this.product = product;
	}

	public int getS_id() {
		return s_id;
	}

	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public String getProduction() {
		return production;
	}

	public void setProduction(String production) {
		this.production = production;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getSucroseContent() {
		return sucroseContent;
	}

	public void setSucroseContent(double sucroseContent) {
		this.sucroseContent = sucroseContent;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((production == null) ? 0 : production.hashCode());
		result = prime * result + s_id;
		temp = Double.doubleToLongBits(sucroseContent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SugarCaneEntity other = (SugarCaneEntity) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (production == null) {
			if (other.production != null)
				return false;
		} else if (!production.equals(other.production))
			return false;
		if (s_id != other.s_id)
			return false;
		if (Double.doubleToLongBits(sucroseContent) != Double.doubleToLongBits(other.sucroseContent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SugarCaneEntity [s_id=" + s_id + ", production=" + production + ", cost=" + cost + ", sucroseContent="
				+ sucroseContent + ", product=" + product + "]";
	}


	

}
