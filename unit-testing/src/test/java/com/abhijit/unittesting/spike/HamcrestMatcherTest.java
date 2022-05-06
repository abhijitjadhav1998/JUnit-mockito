package com.abhijit.unittesting.spike;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.isEmptyString;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class HamcrestMatcherTest {
	
	@Test
	public void Learning() {
		List<Integer> numbers = Arrays.asList(12,15,45); 
		
		assertThat(numbers,hasSize(3));
		assertThat(numbers,hasItems(12,45));
		
		assertThat("",isEmptyString());
		assertThat("ABCDE",containsString("CDE"));
		
		
		
	}

}
