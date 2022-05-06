package com.abhijit.unittesting.Controller;

import org.json.JSONException;
import org.junit.jupiter.api.Test;
import org.skyscreamer.jsonassert.JSONAssert;

class JsonAssertTest {
	
	String actualValue = "{\"id\":1,\"name\":\"Ball\",\"quantity\":100}";

	@Test
	public void jsonAssert_with_strictTrue() throws JSONException  {
		// all the parameter of the actual value must be there is the expected value included with jsonAssert is true.
		String expectedValue = "{\"id\":1,\"name\":\"Ball\",\"quantity\":100}";
		JSONAssert.assertEquals(expectedValue, actualValue, true);
	
	}

	@Test
	public void jsonAssert_with_strictFalse() throws JSONException  {
		String expectedValue = "{\"id\":1,\"quantity\":100}";
		JSONAssert.assertEquals(expectedValue, actualValue, false);
	}
	
	@Test
	public void jsonAssert_without_escape_character() throws JSONException  {
		// all the parameter of the actual value must be there is the expected value included with jsonAssert is true.
		String expectedValue = "{id:1,quantity:100}";
		
		JSONAssert.assertEquals(expectedValue, actualValue, false);
	}
}
