package com.abhijit.unittesting.business;

import org.springframework.beans.factory.annotation.Autowired;

import com.abhijit.unittesting.data.SomeDataService;

public class SomeBusinessLogic {
	
	@Autowired
	private SomeDataService dataService;

	public int calculate(int data[]) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public int calculateUsingDataServcie() {

		int data[] = dataService.retriveAlldata();
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}

	public SomeDataService getDataService() {
		return dataService;
	}

	public void setDataService(SomeDataService dataService) {
		this.dataService = dataService;
	}
	
}
