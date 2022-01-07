package com.xworkz.data_company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="city_info")
public class CityEntity implements Serializable {
	
	@Id
	@Column(name="city_id")
	private int cityId;
	@Column(name="city_name")
	private String cityName;
	@Column(name="city_pop")
	private int population;
	@Column(name="famous_for")
	private String famousFor;
	@Column(name="corona_zone")
	private String coronaZone;
	
	
	public CityEntity()
	{
		
	}


	public CityEntity(int cityId, String cityName, int population, String famousFor, String coronaZone) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.population = population;
		this.famousFor = famousFor;
		this.coronaZone = coronaZone;
	}


	public int getCityId() {
		return cityId;
	}


	public void setCityId(int cityId) {
		this.cityId = cityId;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}


	public String getFamousFor() {
		return famousFor;
	}


	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}


	public String getCoronaZone() {
		return coronaZone;
	}


	public void setCoronaZone(String coronaZone) {
		this.coronaZone = coronaZone;
	}


	@Override
	public String toString() {
		return "CityEntity [cityId=" + cityId + ", cityName=" + cityName + ", population=" + population + ", famousFor="
				+ famousFor + ", coronaZone=" + coronaZone + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cityId;
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
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
		CityEntity other = (CityEntity) obj;
		if (cityId != other.cityId)
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		return true;
	}
	
	
	

}
