package com.abhijit.unittesting.business;

public class SomeBusinessLogic {

	public int calculate(int data[]) {
		int sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum+= data[i];
		}
		return sum;
	}
}
