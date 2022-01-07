package com.xworkz.data_company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="state_info")
public class StateEntity implements Serializable {
	@Id
	@Column(name="state_id")
	private int stateId;
	@Column(name="state_name")
	private String stateName;
	@Column(name="no_of_districts")
	private int noOfDistricts;
	@Column(name="capital")
	private String capitalCity;
	
	public StateEntity()
	{
		
	}

	public StateEntity(int stateId, String stateName, int noOfDistricts, String capitalCity) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.noOfDistricts = noOfDistricts;
		this.capitalCity = capitalCity;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getNoOfDistricts() {
		return noOfDistricts;
	}

	public void setNoOfDistricts(int noOfDistricts) {
		this.noOfDistricts = noOfDistricts;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "StateEntity [stateId=" + stateId + ", stateName=" + stateName + ", noOfDistricts=" + noOfDistricts
				+ ", capitalCity=" + capitalCity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stateId;
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
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
		StateEntity other = (StateEntity) obj;
		if (stateId != other.stateId)
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}
	
	

}
