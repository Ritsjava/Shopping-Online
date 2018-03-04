package net.rits.shopping_backend.Dto;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class product {

	@Id
	private int id;
	private String code;
	private String name;
	private String brand;
	private String description;
	@Column(name="unit_price")
	private double unitprice;
	private int quantity;
	@Column(name="is_active")
	private boolean isactive;
	@Column(name="category_id")
	private int categoryid;
	@Column(name="supplier_id")
	private int supplierid;
	private int purchases;
	private int view;

	public product() {
		// TODO Auto-generated constructor stub
		this.code = UUID.randomUUID().toString().substring(26).toUpperCase();
		System.out.println("nnnnnnnnnnnnn"+code);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitprice() {
		return unitprice;
	}

	public void setUnitprice(double unitprice) {
		this.unitprice = unitprice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isIsactive() {
		return isactive;
	}

	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}

	public int getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}

	public int getSupplierid() {
		return supplierid;
	}

	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}

	public int getPurchases() {
		return purchases;
	}

	public void setPurchases(int purchases) {
		this.purchases = purchases;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

}
