package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Shop;
@Repository
public interface ShopRepository extends CrudRepository<Shop, Integer>{

}