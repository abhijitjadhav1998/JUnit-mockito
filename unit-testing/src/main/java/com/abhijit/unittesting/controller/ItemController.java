package com.abhijit.unittesting.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abhijit.unittesting.model.Item;

@RestController
public class ItemController {
	
	@GetMapping("/item")
	public Item getItem() {
		return new Item(1,"Ball",10,100);
	}

}
