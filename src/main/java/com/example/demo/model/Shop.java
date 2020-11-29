package com.example.demo.model;


import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "item", catalog = "shop")
public class Shop {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
    private int item_id;
    private String item_name;
    private int item_price;
    private int item_quantity;
	public Shop() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Run application
	public Shop(int item_id, String item_name, int item_price, int item_quantity) {
		super();
		this.item_id = item_id;
		this.item_name = item_name;
		this.item_price = item_price;
		this.item_quantity = item_quantity;
	}
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getItem_price() {
		return item_price;
	}
	public void setItem_price(int item_price) {
		this.item_price = item_price;
	}
	public int getItem_quantity() {
		return item_quantity;
	}
	public void setItem_quantity(int item_quantity) {
		this.item_quantity = item_quantity;
	}
    
    
}
