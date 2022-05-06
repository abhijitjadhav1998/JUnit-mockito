package com.abhijit.unittesting.model;

public class Item {

	private int id;
	private String name;
	private int price;
	private int quantity;

	public Item(int id, String name, int price, int quantity) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
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

}
