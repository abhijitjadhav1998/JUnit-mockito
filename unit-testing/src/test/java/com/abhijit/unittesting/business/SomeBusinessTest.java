package com.abhijit.unittesting.business;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SomeBusinessTest {

	@Test
	public void calculateSum_basic() {
		SomeBusinessLogic business = new SomeBusinessLogic();
		int actualResult = business.calculate(new int[] {1,2,3,4});
		int expectedResult = 10;
		assertEquals(expectedResult, actualResult);
	}
	
	@Test
	public void calculateSum_empty() {
		SomeBusinessLogic business = new SomeBusinessLogic();
		int actualResult = business.calculate(new int[] {});
		int expectedResult = 10;
		assertEquals(expectedResult, actualResult);
	}

}
