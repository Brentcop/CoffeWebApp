package com.CoffeeShop.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.CoffeeShop.CoffeeShopWebApp.Items;
import com.CoffeeShop.Dto.ItemsDto;
@Repository
public class ItemsDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<ItemsDto> findAll() {
		String sql = "SELECT itemName,Description,Quantity,Price FROM items";
		 return jdbcTemplate.query(sql,new BeanPropertyRowMapper<ItemsDto>(ItemsDto.class));
}
}