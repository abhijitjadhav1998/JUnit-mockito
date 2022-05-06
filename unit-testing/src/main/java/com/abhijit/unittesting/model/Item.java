package com.abhijit.unittesting.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Item {
	@Id  
	private int id;
	private String name;
	private int price;
	private int quantity;
	@Transient
	private int value;

	public Item(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	

	public Item() {
		super();
	}



	public int getQuantity() {
		return quantity;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Item [quantity=" + quantity + ", price=" + price + ", name=" + name + ", id=" + id + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public int hashCode() {
		return Objects.hash(id, name, price, quantity, value);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		return id == other.id && Objects.equals(name, other.name) && price == other.price && quantity == other.quantity
				&& value == other.value;
	}

	
}
