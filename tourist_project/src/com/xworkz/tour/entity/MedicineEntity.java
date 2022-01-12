package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="medicine_table")
public class MedicineEntity implements Serializable {
	@Id
	@Column(name="m_id")
	private int mId;
	@Column(name="m_name")
	private String mName;
	@Column(name="medical_name")
	private String medicalName;
	@Column(name="mf_date")
	private String mfd;
	@Column(name="exp_date")
	private String expDate;
	@Column(name="used_to_treat")
	private String usedToTreat;
	@Column(name="m_dosage")
	private int dosage;
	
	public MedicineEntity() {
		super();
	}

	public MedicineEntity(int mId, String mName, String medicalName, String mfd, String expDate, String usedToTreat,
			int dosage) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.medicalName = medicalName;
		this.mfd = mfd;
		this.expDate = expDate;
		this.usedToTreat = usedToTreat;
		this.dosage = dosage;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getMedicalName() {
		return medicalName;
	}

	public void setMedicalName(String medicalName) {
		this.medicalName = medicalName;
	}

	public String getMfd() {
		return mfd;
	}

	public void setMfd(String mfd) {
		this.mfd = mfd;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getUsedToTreat() {
		return usedToTreat;
	}

	public void setUsedToTreat(String usedToTreat) {
		this.usedToTreat = usedToTreat;
	}

	public int getDosage() {
		return dosage;
	}

	public void setDosage(int dosage) {
		this.dosage = dosage;
	}

	@Override
	public String toString() {
		return "MedicineEntity [mId=" + mId + ", mName=" + mName + ", medicalName=" + medicalName + ", mfd=" + mfd
				+ ", expDate=" + expDate + ", usedToTreat=" + usedToTreat + ", dosage=" + dosage + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dosage;
		result = prime * result + ((expDate == null) ? 0 : expDate.hashCode());
		result = prime * result + mId;
		result = prime * result + ((mName == null) ? 0 : mName.hashCode());
		result = prime * result + ((medicalName == null) ? 0 : medicalName.hashCode());
		result = prime * result + ((mfd == null) ? 0 : mfd.hashCode());
		result = prime * result + ((usedToTreat == null) ? 0 : usedToTreat.hashCode());
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
		MedicineEntity other = (MedicineEntity) obj;
		if (dosage != other.dosage)
			return false;
		if (expDate == null) {
			if (other.expDate != null)
				return false;
		} else if (!expDate.equals(other.expDate))
			return false;
		if (mId != other.mId)
			return false;
		if (mName == null) {
			if (other.mName != null)
				return false;
		} else if (!mName.equals(other.mName))
			return false;
		if (medicalName == null) {
			if (other.medicalName != null)
				return false;
		} else if (!medicalName.equals(other.medicalName))
			return false;
		if (mfd == null) {
			if (other.mfd != null)
				return false;
		} else if (!mfd.equals(other.mfd))
			return false;
		if (usedToTreat == null) {
			if (other.usedToTreat != null)
				return false;
		} else if (!usedToTreat.equals(other.usedToTreat))
			return false;
		return true;
	}
	
	
	

}
