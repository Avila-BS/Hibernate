package com.xworkz.data_company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="company_details")
public class CompanyEntity implements Serializable{
	
	@Id
	@Column(name="c_id")
	private int cid;
	@Column(name="c_name")
	private String cname;
	@Column(name="c_type")
	private String ctype;
	@Column(name="c_domain")
	private String cdomain;
	@Column(name="c_website")
	private String cwebsite;
	
	
	public CompanyEntity()
	{
		
	}

	public CompanyEntity(int cid, String cname, String ctype, String cdomain, String cwebsite) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ctype = ctype;
		this.cdomain = cdomain;
		this.cwebsite = cwebsite;
	}
	

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public String getCdomain() {
		return cdomain;
	}

	public void setCdomain(String cdomain) {
		this.cdomain = cdomain;
	}

	public String getCwebsite() {
		return cwebsite;
	}

	public void setCwebsite(String cwebsite) {
		this.cwebsite = cwebsite;
	}
	
	


	@Override
	public String toString() {
		return "CompanyEntity [cid=" + cid + ", cname=" + cname + ", ctype=" + ctype + ", cdomain=" + cdomain
				+ ", cwebsite=" + cwebsite + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cid;
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
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
		CompanyEntity other = (CompanyEntity) obj;
		if (cid != other.cid)
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		return true;
	}

}
