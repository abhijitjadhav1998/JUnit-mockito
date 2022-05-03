package com.abhijit.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.anyInt;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;

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

	@Test
	public void verificationBasic() {
		String value1 = (String) mock.get(0);
		String value2 = (String) mock.get(1);

		verify(mock).get(0);
		verify(mock, times(2)).get(anyInt());
		verify(mock, atLeast(1)).get(anyInt());
		verify(mock, atLeastOnce()).get(anyInt());
		verify(mock, never()).get(2);
	}

	@Test
	public void argumentCapture() {

		mock.add("abhijit");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock).add(captor.capture());
		assertEquals("abhijit", captor.getValue());
	}

	@Test
	public void multipleArgumentCapture() {

		mock.add("abhijit");
		mock.add("jadhav");

		ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
		verify(mock, times(2)).add(captor.capture());
		List<String> allValues = captor.getAllValues();
		assertEquals("abhijit", allValues.get(0));
		assertEquals("jadhav", allValues.get(1));
	}

	@Test
	public void spying() {
		ArrayList<String> spy = spy(ArrayList.class);
		spy.add("abhijit");
		spy.add("jadhav");
		System.out.println(spy.get(1));
		verify(spy).add("abhijit");
	}

}
