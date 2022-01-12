package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="railway_info")
public class RailwayStationEntity implements Serializable{

	@Id
	@Column(name="t_id")
	private int tId;
	@Column(name="t_name")
	private String name;
	@Column(name="t_no")
	private int tNo;
	@Column(name="t_source")
	private String source;
	@Column(name="t_dest")
	private String dest;
	@Column(name="t_coucher")
	private String coucher;
	@Column(name="t_couch_no")
	private int couchNo;
	
	public RailwayStationEntity()
	{
		
	}

	public RailwayStationEntity(int tId, String name, int tNo, String source, String dest, String coucher,
			int couchNo) {
		super();
		this.tId = tId;
		this.name = name;
		this.tNo = tNo;
		this.source = source;
		this.dest = dest;
		this.coucher = coucher;
		this.couchNo = couchNo;
	}

	public int gettId() {
		return tId;
	}

	public void settId(int tId) {
		this.tId = tId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int gettNo() {
		return tNo;
	}

	public void settNo(int tNo) {
		this.tNo = tNo;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest = dest;
	}

	public String getCoucher() {
		return coucher;
	}

	public void setCoucher(String coucher) {
		this.coucher = coucher;
	}

	public int getCouchNo() {
		return couchNo;
	}

	public void setCouchNo(int couchNo) {
		this.couchNo = couchNo;
	}

	@Override
	public String toString() {
		return "RailwayStationEntity [tId=" + tId + ", name=" + name + ", tNo=" + tNo + ", source=" + source + ", dest="
				+ dest + ", coucher=" + coucher + ", couchNo=" + couchNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + couchNo;
		result = prime * result + ((coucher == null) ? 0 : coucher.hashCode());
		result = prime * result + ((dest == null) ? 0 : dest.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((source == null) ? 0 : source.hashCode());
		result = prime * result + tId;
		result = prime * result + tNo;
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
		RailwayStationEntity other = (RailwayStationEntity) obj;
		if (couchNo != other.couchNo)
			return false;
		if (coucher == null) {
			if (other.coucher != null)
				return false;
		} else if (!coucher.equals(other.coucher))
			return false;
		if (dest == null) {
			if (other.dest != null)
				return false;
		} else if (!dest.equals(other.dest))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (source == null) {
			if (other.source != null)
				return false;
		} else if (!source.equals(other.source))
			return false;
		if (tId != other.tId)
			return false;
		if (tNo != other.tNo)
			return false;
		return true;
	}
	
}
