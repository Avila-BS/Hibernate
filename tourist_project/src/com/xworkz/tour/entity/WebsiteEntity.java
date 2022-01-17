package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="web_details")
public class WebsiteEntity implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="web_id")
	private int websiteId;
	@Column(name="web_name")
	private String webName;
	@Column(name="web_url")
	private String webURL;
	@Column(name="web_since")
	private int webSince;
	@Column(name="web_domain")
	private String webDomain;
	@Column(name="web_owner")
	private String webOwner;
	
	
	public WebsiteEntity() {
		super();
	}


	public WebsiteEntity( String webName, String webURL, int webSince, String webDomain,
			String webOwner) {
		super();
		
		this.webName = webName;
		this.webURL = webURL;
		this.webSince = webSince;
		this.webDomain = webDomain;
		this.webOwner = webOwner;
	}


	public int getWebsiteId() {
		return websiteId;
	}


	public void setWebsiteId(int websiteId) {
		this.websiteId = websiteId;
	}


	public String getWebName() {
		return webName;
	}


	public void setWebName(String webName) {
		this.webName = webName;
	}


	public String getWebURL() {
		return webURL;
	}


	public void setWebURL(String webURL) {
		this.webURL = webURL;
	}


	public int getWebSince() {
		return webSince;
	}


	public void setWebSince(int webSince) {
		this.webSince = webSince;
	}


	public String getWebDomain() {
		return webDomain;
	}


	public void setWebDomain(String webDomain) {
		this.webDomain = webDomain;
	}


	public String getWebOwner() {
		return webOwner;
	}


	public void setWebOwner(String webOwner) {
		this.webOwner = webOwner;
	}


	@Override
	public String toString() {
		return "WebsiteEntity [websiteId=" + websiteId + ", webName=" + webName + ", webURL=" + webURL + ", webSince="
				+ webSince + ", webDomain=" + webDomain + ", webOwner=" + webOwner + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((webDomain == null) ? 0 : webDomain.hashCode());
		result = prime * result + ((webName == null) ? 0 : webName.hashCode());
		result = prime * result + ((webOwner == null) ? 0 : webOwner.hashCode());
		result = prime * result + webSince;
		result = prime * result + ((webURL == null) ? 0 : webURL.hashCode());
		result = prime * result + websiteId;
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
		WebsiteEntity other = (WebsiteEntity) obj;
		if (webDomain == null) {
			if (other.webDomain != null)
				return false;
		} else if (!webDomain.equals(other.webDomain))
			return false;
		if (webName == null) {
			if (other.webName != null)
				return false;
		} else if (!webName.equals(other.webName))
			return false;
		if (webOwner == null) {
			if (other.webOwner != null)
				return false;
		} else if (!webOwner.equals(other.webOwner))
			return false;
		if (webSince != other.webSince)
			return false;
		if (webURL == null) {
			if (other.webURL != null)
				return false;
		} else if (!webURL.equals(other.webURL))
			return false;
		if (websiteId != other.websiteId)
			return false;
		return true;
	}
	
	
	

}
