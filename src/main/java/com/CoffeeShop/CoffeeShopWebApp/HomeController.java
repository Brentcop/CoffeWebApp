package com.CoffeeShop.CoffeeShopWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	@Autowired
	Person p;
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "test", "Hello World");
}
	@RequestMapping("/register")
	public ModelAndView register() {
		return new ModelAndView("register", "test", "Hello World");
	}
	@RequestMapping("/registerGreeting")
	public ModelAndView registerGreeting(@RequestParam("fName") String firstName, @RequestParam("lName") String lastName) {
		p.setFirstName(firstName);
		p.setLastName(lastName);
		return new ModelAndView("registerGreeting", "p", p);
	}
}
