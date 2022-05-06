package com.abhijit.unittesting.controller.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.abhijit.unittesting.model.Item;
import com.abhijit.unittesting.repository.ItemRepository;

@Component
public class ItemBusinessService {
	@Autowired
	private ItemRepository repository;

	public Item hardCodedItems() {
		return new Item(1,"Ball",10,100);
	}
	
	public List<Item> retriveAllItems(){
		List<Item> items =repository.findAll();
		for(Item item : items) {
			item.setValue(item.getPrice() * item.getQuantity());
		}
		return items;
	}

}
