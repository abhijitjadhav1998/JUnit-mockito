package com.abhijit.unittesting.business;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.abhijit.unittesting.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService{

	@Override
	public int[] retriveAlldata() {
		return new int[] {1,2,3,4};
	}
	
}

public class SomeBusinessStubTestDataService {

	@Test
	public void calculateSumDataService_basic() {
		SomeBusinessLogic business = new SomeBusinessLogic();
		business.setDataService(new SomeDataServiceStub());
		int actualResult = business.calculateUsingDataServcie();
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
