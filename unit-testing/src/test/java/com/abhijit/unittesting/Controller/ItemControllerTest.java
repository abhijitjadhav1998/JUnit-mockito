package com.abhijit.unittesting.Controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.abhijit.unittesting.controller.ItemController;
import com.abhijit.unittesting.controller.business.ItemBusinessService;
import com.abhijit.unittesting.model.Item;

@RunWith(SpringRunner.class)
@WebMvcTest(ItemController.class)
class ItemControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ItemBusinessService businessService;

	@Test
	public void item_matcher() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/item").accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}")).andReturn();
		// assertEquals("Hello World", result.getResponse().getContentAsString());
	}

	@Test
	public void item_from_business_service() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/item-from-business-service")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("{\"id\":1,\"name\":\"Ball\",\"price\":10,\"quantity\":100}")).andReturn();
		// assertEquals("Hello World", result.getResponse().getContentAsString());
	}

	@Test
	public void retrive_all_items() throws Exception {
		when(businessService.retriveAllItems()).thenReturn(Arrays.asList(new Item(1001, "Item1", 10, 20)));
		RequestBuilder request = MockMvcRequestBuilders.get("/all-items-from-database")
				.accept(MediaType.APPLICATION_JSON);
		MvcResult result = mockMvc.perform(request).andExpect(status().isOk())
				.andExpect(content().json("[{\"id\":1001,\"name\":\"Item1\",\"price\":10,\"quantity\":20}]")).andReturn();
		// assertEquals("Hello World", result.getResponse().getContentAsString());
	}

}
