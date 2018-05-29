package com.CoffeeShop.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.CoffeeShop.CoffeeShopWebApp.Items;
@Repository
public class ItemsDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addPerson(Items items) {
		String sql = "SELECT name, discription FROM items;  (Name,Discription) VALUES(?,?)";
		jdbcTemplate.update(sql, items.getName(), items.getDiscription());
}
}