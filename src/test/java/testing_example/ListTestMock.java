package testing_example;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTestMock {

	@Test
	public void test_mocklistsize() {
		List mockList= mock(List.class);
		when(mockList.size()).thenReturn(4);
		
		assertEquals(4,mockList.size());
	}
	
	@Test(expected=RuntimeException.class)
	public void test_mocklistGet() {
		List mockList= mock(List.class);
		when(mockList.get(anyInt())).thenThrow(new RuntimeException("Some Exception"));
		
		mockList.get(4);
	}

}
