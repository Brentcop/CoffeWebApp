package com.CoffeeShop.CoffeeShopWebApp;

import com.CoffeeShop.jdbc.ItemsDao;

public class Items {
	private String Name;
	private String Discription;
	private int Quantity;
	private double Price;
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public Items() {
		super();
		Name = "";
		Discription = "";
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public String getDiscription() {
		return Discription;
	}
	public void setDiscription(String Discription) {
		this.Discription = Discription;
	}
	
	public Items(String Name, String lastName) {
		super();
		this.Name = Name;
		this.Discription = Discription;
	}
	@Override
	public String toString() {
		return "Items [Name=" + Name + ", Discription=" + Discription + ", Quantity=" + Quantity + ", Price=" + Price
				+ "]";
	}

}

