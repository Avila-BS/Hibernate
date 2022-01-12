package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="silk_manufactures")

public class SilkManufacturerEntity implements Serializable{
	
	@Id
	@Column(name="silk_id")
	private int silkId;
	@Column(name="mf_state")
	private String manufacturedState;
	@Column(name="percentage_of_prod")
	private float percentageOfProduction;
	@Column(name="elasticity")
	private String elasticity;
	@Column(name="silk_type")
	private String silkType;
	@Column(name="silk_cost")
	private double cost;
	@Column(name="quality")
	private boolean goodQuality;
	
	
	public SilkManufacturerEntity()
	{
		
	}


	public SilkManufacturerEntity(int silkId, String manufacturedState, float percentageOfProduction, String elasticity,
			String silkType, double cost, boolean goodQuality) {
		super();
		this.silkId = silkId;
		this.manufacturedState = manufacturedState;
		this.percentageOfProduction = percentageOfProduction;
		this.elasticity = elasticity;
		this.silkType = silkType;
		this.cost = cost;
		this.goodQuality = goodQuality;
	}


	public int getSilkId() {
		return silkId;
	}


	public void setSilkId(int silkId) {
		this.silkId = silkId;
	}


	public String getManufacturedState() {
		return manufacturedState;
	}


	public void setManufacturedState(String manufacturedState) {
		this.manufacturedState = manufacturedState;
	}


	public float getPercentageOfProduction() {
		return percentageOfProduction;
	}


	public void setPercentageOfProduction(float percentageOfProduction) {
		this.percentageOfProduction = percentageOfProduction;
	}


	public String getElasticity() {
		return elasticity;
	}


	public void setElasticity(String elasticity) {
		this.elasticity = elasticity;
	}


	public String getSilkType() {
		return silkType;
	}


	public void setSilkType(String silkType) {
		this.silkType = silkType;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public boolean isGoodQuality() {
		return goodQuality;
	}


	public void setGoodQuality(boolean goodQuality) {
		this.goodQuality = goodQuality;
	}


	@Override
	public String toString() {
		return "SilkManufacturerEntity [silkId=" + silkId + ", manufacturedState=" + manufacturedState
				+ ", percentageOfProduction=" + percentageOfProduction + ", elasticity=" + elasticity + ", silkType="
				+ silkType + ", cost=" + cost + ", goodQuality=" + goodQuality + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(cost);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((elasticity == null) ? 0 : elasticity.hashCode());
		result = prime * result + (goodQuality ? 1231 : 1237);
		result = prime * result + ((manufacturedState == null) ? 0 : manufacturedState.hashCode());
		result = prime * result + Float.floatToIntBits(percentageOfProduction);
		result = prime * result + silkId;
		result = prime * result + ((silkType == null) ? 0 : silkType.hashCode());
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
		SilkManufacturerEntity other = (SilkManufacturerEntity) obj;
		if (Double.doubleToLongBits(cost) != Double.doubleToLongBits(other.cost))
			return false;
		if (elasticity == null) {
			if (other.elasticity != null)
				return false;
		} else if (!elasticity.equals(other.elasticity))
			return false;
		if (goodQuality != other.goodQuality)
			return false;
		if (manufacturedState == null) {
			if (other.manufacturedState != null)
				return false;
		} else if (!manufacturedState.equals(other.manufacturedState))
			return false;
		if (Float.floatToIntBits(percentageOfProduction) != Float.floatToIntBits(other.percentageOfProduction))
			return false;
		if (silkId != other.silkId)
			return false;
		if (silkType == null) {
			if (other.silkType != null)
				return false;
		} else if (!silkType.equals(other.silkType))
			return false;
		return true;
	}
	
	
	
	

}
