package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="factory_info")
public class FactoryEntity implements Serializable {
	@Id
	@Column(name="f_id")
	private int fId;
	@Column(name="f_name")
	private String fName;
	@Column(name="f_type")
	private String fType;
	@Column(name="f_area")
	private double area;
	@Column(name="f_location")
	private String location;
	@Column(name="employes")
	private int employes;
	@Column(name="f_scale")
	private String scale;
	
	public FactoryEntity()
	{
		
	}

	public FactoryEntity(int fId, String fName, String fType, double area, String location, int employes,
			String scale) {
		super();
		this.fId = fId;
		this.fName = fName;
		this.fType = fType;
		this.area = area;
		this.location = location;
		this.employes = employes;
		this.scale = scale;
	}

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfType() {
		return fType;
	}

	public void setfType(String fType) {
		this.fType = fType;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEmployes() {
		return employes;
	}

	public void setEmployes(int employes) {
		this.employes = employes;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	@Override
	public String toString() {
		return "FactoryEntity [fId=" + fId + ", fName=" + fName + ", fType=" + fType + ", area=" + area + ", location="
				+ location + ", employes=" + employes + ", scale=" + scale + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(area);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + employes;
		result = prime * result + fId;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((fType == null) ? 0 : fType.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((scale == null) ? 0 : scale.hashCode());
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
		FactoryEntity other = (FactoryEntity) obj;
		if (Double.doubleToLongBits(area) != Double.doubleToLongBits(other.area))
			return false;
		if (employes != other.employes)
			return false;
		if (fId != other.fId)
			return false;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (fType == null) {
			if (other.fType != null)
				return false;
		} else if (!fType.equals(other.fType))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (scale == null) {
			if (other.scale != null)
				return false;
		} else if (!scale.equals(other.scale))
			return false;
		return true;
	}
	
	

}
