package com.xworkz.data_company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="patient_details")
public class PatientEntity implements Serializable {
	@Id
	@Column(name="patient_id")
	private int patientId;
	@Column(name="patient_name")
	private String patientName;
	@Column(name="birth_place")
	private String birthPlace;
	@Column(name="corona_positive")
	private boolean coronaPositive;
	@Column(name="age")
	private int age;
	@Column(name="bu_no")
	private int buNo;
	
	public PatientEntity()
	{
		
	}

	public PatientEntity(int patientId, String patientName, String birthPlace, boolean coronaPositive, int age,
			int buNo) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.birthPlace = birthPlace;
		this.coronaPositive = coronaPositive;
		this.age = age;
		this.buNo = buNo;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public boolean isCoronaPositive() {
		return coronaPositive;
	}

	public void setCoronaPositive(boolean coronaPositive) {
		this.coronaPositive = coronaPositive;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBuNo() {
		return buNo;
	}

	public void setBuNo(int buNo) {
		this.buNo = buNo;
	}

	@Override
	public String toString() {
		return "PatientEntity [patientId=" + patientId + ", patientName=" + patientName + ", birthPlace=" + birthPlace
				+ ", coronaPositive=" + coronaPositive + ", age=" + age + ", buNo=" + buNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + (coronaPositive ? 1231 : 1237);
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
		PatientEntity other = (PatientEntity) obj;
		if (age != other.age)
			return false;
		if (coronaPositive != other.coronaPositive)
			return false;
		return true;
	}
	
	

}
