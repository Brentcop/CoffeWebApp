package com.CoffeeShop.CoffeeShopWebApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.CoffeeShop.Dto.ItemsDto;
import com.CoffeeShop.jdbc.ItemsDao;
import com.CoffeeShop.jdbc.PersonDao;

@Controller
public class HomeController {
	@Autowired
	Person p;
	@Autowired
	PersonDao z;
	@Autowired
	private ItemsDao itemsDao;
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "test", "Hello World");
}
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register", "test", "Hello World");
	}
	@RequestMapping("/registerGreeting")
	
	public ModelAndView registerGreeting(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {
		List<ItemsDto> items = itemsDao.findAll();
		return new ModelAndView("registerGreeting", "items", items);
	}
}
