package com.xworkz.data_company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="country_info")
public class CountryEntity implements Serializable {
	
	@Id
	@Column(name="country_id")
	private int countryId;
	@Column(name="country_name")
	private String countryName;
	@Column(name="country_continent")
	private String countryContinent;
	@Column(name="country_pop")
	private int countryPopulation;
	
	public CountryEntity()
	{
		
	}

	public CountryEntity(int countryId, String countryName, String countryContinent, int countryPopulation) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
		this.countryContinent = countryContinent;
		this.countryPopulation = countryPopulation;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryContinent() {
		return countryContinent;
	}

	public void setCountryContinent(String countryContinent) {
		this.countryContinent = countryContinent;
	}

	public int getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(int countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	@Override
	public String toString() {
		return "CountryEntity [countryId=" + countryId + ", countryName=" + countryName + ", countryContinent="
				+ countryContinent + ", countryPopulation=" + countryPopulation + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + countryId;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
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
		CountryEntity other = (CountryEntity) obj;
		if (countryId != other.countryId)
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		return true;
	}
	
	
	
	
	

}
