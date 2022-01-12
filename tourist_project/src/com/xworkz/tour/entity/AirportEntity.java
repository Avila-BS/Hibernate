package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="airport_table")
public class AirportEntity implements Serializable {
	@Id
	@Column(name="a_id")
	private int aId;
	@Column(name="a_name")
	private String aName;
	@Column(name="a_no")
	private String aNo;
	@Column(name="boarding")
	private String boarding;
	@Column(name="dest")
	private String dest;
	@Column(name="ticket_price")
	private double ticketPrice;
	@Column(name="travellers")
	private int travellers;
	
	
	public AirportEntity() {
		super();
	}


	public AirportEntity(int aId, String aName, String aNo, String boarding, String dest, double ticketPrice,
			int travellers) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.aNo = aNo;
		this.boarding = boarding;
		this.dest = dest;
		this.ticketPrice = ticketPrice;
		this.travellers = travellers;
	}


	public int getaId() {
		return aId;
	}


	public void setaId(int aId) {
		this.aId = aId;
	}


	public String getaName() {
		return aName;
	}


	public void setaName(String aName) {
		this.aName = aName;
	}


	public String getaNo() {
		return aNo;
	}


	public void setaNo(String aNo) {
		this.aNo = aNo;
	}


	public String getBoarding() {
		return boarding;
	}


	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}


	public String getDest() {
		return dest;
	}


	public void setDest(String dest) {
		this.dest = dest;
	}


	public double getTicketPrice() {
		return ticketPrice;
	}


	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}


	public int getTravellers() {
		return travellers;
	}


	public void setTravellers(int travellers) {
		this.travellers = travellers;
	}


	@Override
	public String toString() {
		return "AirportEntity [aId=" + aId + ", aName=" + aName + ", aNo=" + aNo + ", boarding=" + boarding + ", dest="
				+ dest + ", ticketPrice=" + ticketPrice + ", travellers=" + travellers + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aId;
		result = prime * result + ((aName == null) ? 0 : aName.hashCode());
		result = prime * result + ((aNo == null) ? 0 : aNo.hashCode());
		result = prime * result + ((boarding == null) ? 0 : boarding.hashCode());
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		long temp;
		temp = Double.doubleToLongBits(ticketPrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + travellers;
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
		AirportEntity other = (AirportEntity) obj;
		if (aId != other.aId)
			return false;
		if (aName == null) {
			if (other.aName != null)
				return false;
		} else if (!aName.equals(other.aName))
			return false;
		if (aNo == null) {
			if (other.aNo != null)
				return false;
		} else if (!aNo.equals(other.aNo))
			return false;
		if (boarding == null) {
			if (other.boarding != null)
				return false;
		} else if (!boarding.equals(other.boarding))
			return false;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (Double.doubleToLongBits(ticketPrice) != Double.doubleToLongBits(other.ticketPrice))
			return false;
		if (travellers != other.travellers)
			return false;
		return true;
	}
	
	
	

}
