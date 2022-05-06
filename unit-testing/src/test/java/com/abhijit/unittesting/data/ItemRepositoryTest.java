package com.abhijit.unittesting.data;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.abhijit.unittesting.model.Item;
import com.abhijit.unittesting.repository.ItemRepository;

@ExtendWith(MockitoExtension.class) // JUnit 5
@DataJpaTest
public class ItemRepositoryTest {
	@Autowired
	private ItemRepository repository;

	@Test
	public void testFindAll() {
		List<Item> items = repository.findAll();
		assertEquals(5,items.size());
	}

}
