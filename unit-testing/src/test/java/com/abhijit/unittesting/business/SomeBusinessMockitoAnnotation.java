package com.abhijit.unittesting.business;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.abhijit.unittesting.data.SomeDataService;

//@RunWith(MockitoJUnitRunner.class) Junit 4

@ExtendWith(MockitoExtension.class) // JUnit 5
public class SomeBusinessMockitoAnnotation {
	@InjectMocks
	SomeBusinessLogic business;
	@Mock
	SomeDataService dataServiceMock;

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
