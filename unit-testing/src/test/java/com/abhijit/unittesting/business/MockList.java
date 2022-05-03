package com.abhijit.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;

class MockList {
	
	@Mock
	List mock = mock(List.class);
	
	@Test
	void list_size() {
		when(mock.size()).thenReturn(5);
		assertEquals(5, mock.size());
	}
	
	@Test
	void list_size_return_different_value() {
		when(mock.size()).thenReturn(5).thenReturn(15);
		assertEquals(5, mock.size());
		assertEquals(15, mock.size());
	}
	
	@Test
	void list_get_with_param() {
		when(mock.get(0)).thenReturn("abhijit").thenReturn("jadhav");
		assertEquals("abhijit", mock.get(0));
		assertEquals("jadhav", mock.get(0));
	}

	@Test
	void list_get_with_generic_param() {
		when(mock.get(anyInt())).thenReturn("abhijit").thenReturn("jadhav");
		assertEquals("abhijit", mock.get(0));
		assertEquals("jadhav", mock.get(1));
	}


}
