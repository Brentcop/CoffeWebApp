package com.CoffeeShop.Dto;

import java.io.Serializable;

public class ItemsDto implements Serializable {
	private String itemName;
	private String description;
	private int quantity;
	private double price;
	
	public ItemsDto() {
		// TODO Auto-generated constructor stub
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ItemsDto [itemName=" + itemName + ", description=" + description + ", quantity=" + quantity + ", price="
				+ price + "]";
	}

	
	
}
