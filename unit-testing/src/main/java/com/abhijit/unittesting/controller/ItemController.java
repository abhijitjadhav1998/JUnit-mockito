package com.abhijit.unittesting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhijit.unittesting.controller.business.ItemBusinessService;
import com.abhijit.unittesting.model.Item;

@RestController
public class ItemController {
	
	@Autowired
	private ItemBusinessService businessService;
	
	@GetMapping("/item")
	public Item getItem() {
		return new Item(1,"Ball",10,100);
	}
	
	@GetMapping("/item-from-business-service")
	public Item getItemFromBusinessService() {
		return businessService.hardCodedItems();
	}
	
	@GetMapping("/all-items-from-database")
	public List<Item> getAllItems(){
		return businessService.retriveAllItems();
	}

}
