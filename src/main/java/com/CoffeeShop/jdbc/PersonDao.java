package com.CoffeeShop.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.CoffeeShop.CoffeeShopWebApp.Person;

@Repository
public class PersonDao {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public void addPerson(Person person) {
		String sql = "INSERT INTO users (firstName,lastName) VALUES(?,?)";
		jdbcTemplate.update(sql, person.getFirstName(), person.getLastName());
	}
	
}
