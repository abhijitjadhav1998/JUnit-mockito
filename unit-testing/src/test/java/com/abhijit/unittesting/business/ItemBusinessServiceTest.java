package com.abhijit.unittesting.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.abhijit.unittesting.controller.business.ItemBusinessService;
import com.abhijit.unittesting.model.Item;
import com.abhijit.unittesting.repository.ItemRepository;

//@RunWith(MockitoJUnitRunner.class) Junit 4

@ExtendWith(MockitoExtension.class) // JUnit 5
public class ItemBusinessServiceTest {
	@InjectMocks
	private ItemBusinessService business;
	@Mock
	private ItemRepository repository;

	@Test
	public void retriveAllItemsTest() {
		when(repository.findAll())
				.thenReturn(Arrays.asList(new Item(1001, "Item1", 10, 20), new Item(1002, "Item2", 20, 20)));
		List<Item> items = business.retriveAllItems();
		assertEquals(200, items.get(0).getValue());
		assertEquals(400, items.get(1).getValue());

	}
}
