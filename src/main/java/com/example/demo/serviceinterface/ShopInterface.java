package com.example.demo.serviceinterface;

import java.util.List;

import com.example.demo.model.Shop;

public interface ShopInterface {
	  //To save data
		public Shop saveShop(Shop shop);
	  
	  //to fetch data	
		public List<Shop> findAllShops();
		
		
	}
