package testing_example;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class TodoBusinessImplStubTest {
	
	@Test
	public void test() {
		TodoServiceStub todoServiceStub= new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl= new TodoBusinessImpl(todoServiceStub);
		
		List<String> filteredTodos= todoBusinessImpl.retrieveTodosRelatedToSpring("Debanka");
		
		assertEquals(1,filteredTodos.size()); // retrieveTodosRelatedToSpring("Debanka") method should return only one string:- Learn Spring mvc
	}

}
