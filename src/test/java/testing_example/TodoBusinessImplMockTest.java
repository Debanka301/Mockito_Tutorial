package testing_example;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matcher;
import org.junit.Test;
public class TodoBusinessImplMockTest {
	
	@Test
	public void test_mock1() {
		
		TodoService todoServiceMock= mock(TodoService.class);
		
		List<String> todos= Arrays.asList("Learn Spring mvc","Learn Mockito","Learn Spring Core");
		
		when(todoServiceMock.retrieveTodos("Debanka")).thenReturn(todos);

		TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Debanka");
		
		assertEquals(2,filteredTodos.size()); // retrieveTodosRelatedToSpring("Debanka") method should return only one string:- Learn Spring mvc
	}
	
	@Test
	public void test_mock2() {
		
		TodoService todoServiceMock= mock(TodoService.class);
		
		List<String> todos= Arrays.asList();
		
		when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(todos);

		TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceMock);
		
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
		
		assertEquals(0,filteredTodos.size()); // retrieveTodosRelatedToSpring("Debanka") method should return only one string:- Learn Spring mvc
	}
	
	

}
