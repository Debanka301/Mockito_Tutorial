package testing_example;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperParameterized {
	
	private String input;
	private String expected;
	
	
	
	public StringHelperParameterized(String input, String expected) {
		super();
		this.input = input;
		this.expected = expected;
	}


		StringHelper helper= new StringHelper();
	
	
	
	@Parameters
	public static Collection<String[]> testConditions() {
		String expectedOutputs[][] = {{"AACD","CD"},{"AA",""},{"CDAA","CDAA"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void test_truncateAInFirst2Positions() {
		assertEquals(expected,helper.truncateAInFirst2Positions(input));
	}

}
