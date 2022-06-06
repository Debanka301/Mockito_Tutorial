package testing_example;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.*;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplInjectMocksTest {
	
	@Mock
	TodoService todoServiceMock; // Mocks the TodoService interface
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl; // Injects Dependencies in TodoBusinessImpl class

	
	@Test
	public void test_mock1() {
		
		List<String> todos= Arrays.asList("Learn Spring mvc","Learn Mockito","Learn Spring Core");
		
		when(todoServiceMock.retrieveTodos("Debanka")).thenReturn(todos);
		
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Debanka");
		
		assertEquals(2,filteredTodos.size()); // retrieveTodosRelatedToSpring("Debanka") method should return only one string:- Learn Spring mvc
	}

}
