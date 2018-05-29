package com.CoffeeShop.CoffeeShopWebApp;

import com.CoffeeShop.jdbc.ItemsDao;

public class Items {
	private String Name;
	private String Discription;
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
		return "Items [name=" + Name + ", Discription=" + Discription + "]";
	}

}

