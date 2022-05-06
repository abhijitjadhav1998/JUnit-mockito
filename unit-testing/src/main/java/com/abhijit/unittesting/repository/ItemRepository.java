package com.abhijit.unittesting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhijit.unittesting.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer>{
	
	public Item findByIdAndName(int id, String name);

}
