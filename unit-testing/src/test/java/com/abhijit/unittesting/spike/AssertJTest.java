package com.abhijit.unittesting.spike;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AssertJTest {

	@Test
	public void Learning() {
		List<Integer> numbers = Arrays.asList(12, 15, 45);

		assertThat(numbers).hasSize(3).contains(12, 15).allMatch(x -> x > 10).allMatch(x -> x < 100);

		assertThat("").isEmpty();
		assertThat("ABCDE").contains("CDE").startsWith("A").endsWith("E");

	}

}
