package com.abhijit.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.abhijit.unittesting.data.SomeDataService;

public class SomeBusinessMockitoDataService {

	SomeBusinessLogic business = new SomeBusinessLogic();
	SomeDataService dataServiceMock = mock(SomeDataService.class);

	@BeforeEach
	public void before() {
		business.setDataService(dataServiceMock);
	}

	@Test
	public void calculateSumDataService_basic() {
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] { 1, 2, 3, 4 });
		assertEquals(10, business.calculateUsingDataServcie());
	}

	@Test
	public void calculateSumDataService_empty() {
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] {});
		assertEquals(0, business.calculateUsingDataServcie());
	}

	@Test
	public void calculateSumDataService_oneValue() {
		when(dataServiceMock.retriveAlldata()).thenReturn(new int[] { 1 });
		assertEquals(1, business.calculateUsingDataServcie());
	}

}
