package com.example.demo.controller;


import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Shop;
import com.example.demo.serviceimplementation.ShopServiceImpl;

@RestController
//we are using postman
@CrossOrigin("*")
public class HomeController {
	// create implementation class
	@Autowired
	private ShopServiceImpl shopServiceImpl;
	
	//to save
	@PostMapping(value = "saveShop")
	public Shop saveShop(@RequestBody Shop shop) {
		System.out.println("Shop saved!");
		shopServiceImpl.saveShop(shop);
		return shop;
	}
	
	@GetMapping(value = "getAllShops")
	public java.util.List<Shop> findAllShop(){
		return shopServiceImpl.findAllShops();
	}
	
	
}