package com.example.demo.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ShopRepository;
import com.example.demo.model.Shop;
import com.example.demo.serviceinterface.ShopInterface;

@Service
public class ShopServiceImpl implements ShopInterface{
	
    @Autowired
    private ShopRepository shopRepo;
	@Override
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		return shopRepo.save(shop);
	}

	@Override
	public List<Shop> findAllShops() {
		// TODO Auto-generated method stub
		return (List<Shop>) shopRepo.findAll();
	}

}