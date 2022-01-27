package com.xworkz.stationary.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@Entity
@Table(name="stationary_detailss")

public class StationaryEntity implements Serializable{

		@Id
		@Column(name="id")
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		@Column(name="Stationary_name")
		private String stationaryName;
		@Column(name="owner_name")
		private String ownerName;
		@Column(name="mail_id")
		private String mailId;
		@Column(name="contact_no")
		private long contactNo;
		@Column(name="alernate_no")
		private long alternateNo;
		@Column(name="book_brand")
		private String bookBrand;
		@Column(name="no_of_books_available")
		private int booksAvailable;
		@Column(name="cost_of_book")
		private double costOfBook;
		@Column(name="xerox_available")
		private boolean xeroxAvailbale;
		@Column(name="price_of_one_copy")
		private double priceForOneCopy;
		@Column(name="geometry_items")
		private boolean geometryItems;
		@Column(name="open_time")
		private String openTime;
		@Column(name="close_time")
		private String closeTime;
		@Column(name="createdBy")
		private String createdBy;
		@Column(name="created_on")
		private LocalDateTime createdOn;
		
		
		public StationaryEntity(String stationaryName, String ownerName, String mailId, long contactNo,
				long alternateNo, String bookBrand, int booksAvailable, double costOfBook, boolean xeroxAvailbale,
				double priceForOneCopy, boolean geometryItems, String openTime, String closeTime, String createdBy,
				LocalDateTime createdOn) {
			super();
			this.stationaryName = stationaryName;
			this.ownerName = ownerName;
			this.mailId = mailId;
			this.contactNo = contactNo;
			this.alternateNo = alternateNo;
			this.bookBrand = bookBrand;
			this.booksAvailable = booksAvailable;
			this.costOfBook = costOfBook;
			this.xeroxAvailbale = xeroxAvailbale;
			this.priceForOneCopy = priceForOneCopy;
			this.geometryItems = geometryItems;
			this.openTime = openTime;
			this.closeTime = closeTime;
			this.createdBy = createdBy;
			this.createdOn = createdOn;
		}
		
		
		
		
		
		
		
		
		
		

	}


