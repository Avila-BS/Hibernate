package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="biscuit_details")
public class BiscuitEntity implements Serializable {
  
	@Id
	@Column(name="b_id")
	private int bId;
	@Column(name="b_name")
	private String bName;
	@Column(name="flavour")
	private String flavour;
	@Column(name="price")
	private float price;
	@Column(name="no_of_pieces")
	private int pieces;
	@Column(name="shape")
	private String shape;
	@Column(name="sugar_less")
	private boolean sugarLess;
	
	public BiscuitEntity() {
		super();
	}

	public BiscuitEntity(int bId, String bName, String flavour, float price, int pieces, String shape,
			boolean sugarLess) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.flavour = flavour;
		this.price = price;
		this.pieces = pieces;
		this.shape = shape;
		this.sugarLess = sugarLess;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getPieces() {
		return pieces;
	}

	public void setPieces(int pieces) {
		this.pieces = pieces;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public boolean isSugarLess() {
		return sugarLess;
	}

	public void setSugarLess(boolean sugarLess) {
		this.sugarLess = sugarLess;
	}

	@Override
	public String toString() {
		return "BiscuitEntity [bId=" + bId + ", bName=" + bName + ", flavour=" + flavour + ", price=" + price
				+ ", pieces=" + pieces + ", shape=" + shape + ", sugarLess=" + sugarLess + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bId;
		result = prime * result + ((bName == null) ? 0 : bName.hashCode());
		result = prime * result + ((flavour == null) ? 0 : flavour.hashCode());
		result = prime * result + pieces;
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		result = prime * result + (sugarLess ? 1231 : 1237);
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
		BiscuitEntity other = (BiscuitEntity) obj;
		if (bId != other.bId)
			return false;
		if (bName == null) {
			if (other.bName != null)
				return false;
		} else if (!bName.equals(other.bName))
			return false;
		if (flavour == null) {
			if (other.flavour != null)
				return false;
		} else if (!flavour.equals(other.flavour))
			return false;
		if (pieces != other.pieces)
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		if (sugarLess != other.sugarLess)
			return false;
		return true;
	}

	
}
