package com.cognizant.project.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "pharmacy")
public class Medicines {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	@NotEmpty(message = "Cannot be blank")
	private String name;
	@Column(name = "type")
	@NotEmpty(message = "select an option")
	private String type;
	@Column(name = "price")
	@NotNull
	@DecimalMin(value = "0.1", inclusive = true, message = "price cannot be zero")
	private double price;
	@NotEmpty(message = "Cannot be blank")
	@Column(name = "manufacturer")
	private String manufacturer;
	@Temporal(TemporalType.DATE)
	@Column(name = "date_of_expiry")
	@NotNull
	@Future
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date dateOfExpiry;

	@Column(name = "batch_no")
	@Range(min = 1)
	private int batchNo;
	@Column(name = "units_available")

	@Range(min = 1)
	private int unitsAvailable;

	public Medicines() {
	}

	public Medicines(String name, String type, double price, String manufacturer, Date dateOfExpiry, int batchNo,
			int unitsAvailable) {
		super();
		this.name = name;
		this.type = type;
		this.price = price;
		this.manufacturer = manufacturer;
		this.dateOfExpiry = dateOfExpiry;
		this.setBatchNo(batchNo);
		this.setUnitsAvailable(unitsAvailable);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}

	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}

	public int getUnitsAvailable() {
		return unitsAvailable;
	}

	public void setUnitsAvailable(int unitsAvailable) {
		this.unitsAvailable = unitsAvailable;
	}

	public int getBatchNo() {
		return batchNo;
	}

	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}

	@Override
	public String toString() {
		return "Medicines [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", manufacturer="
				+ manufacturer + ", dateOfExpiry=" + dateOfExpiry + ", batchNo=" + batchNo + ", unitsAvailable="
				+ unitsAvailable + "]";
	}

	
}
