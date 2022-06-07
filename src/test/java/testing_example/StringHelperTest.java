package testing_example;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper;
	
	@Before
	public void beforeSetup() {       // Creates a new Object before every tests.
		helper= new StringHelper();
	}

	@Test
	public void test_truncateAInFirst2Positions_1() {
		assertEquals("BC",helper.truncateAInFirst2Positions("AABC"));
	}
	
	@Test
	public void test_truncateAInFirst2Positions_2() {
		assertEquals("",helper.truncateAInFirst2Positions("AA"));
	}
	
	@Test
	public void test_areFirstAndLastTwoCharactersTheSame_1() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("abba"));
	}
	
	@Test
	public void test_areFirstAndLastTwoCharactersTheSame_2() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("abab"));
	}
	
	@Test
	public void test_areFirstAndLastTwoCharactersTheSame_3() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame(""));
	}
	
	
	
	

	//---------------------------------  Test Arrays Class -----------------------------------------------------
	
	@Test
	public void testArraySorting() {
		int arr[]= {10,2,4,14};
		int expected[]= {2,4,10,14};
		Arrays.sort(arr);
		assertArrayEquals(expected,arr);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArray_exception() {
		int arr[]= null;
		int expected[]= {2,4,10,14};
		Arrays.sort(arr);
	}
	
	@Test(timeout=100)
	public void testArray_forTLE() {
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		for(int i=0;i<1000000;i++) {
			arr[0]= i;
			Arrays.sort(arr);
		}
	}
}
