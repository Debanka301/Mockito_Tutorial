package testing_example;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService {

	//2 problems with Stubs:- all unimplemented methods of interface has to be implemented 
	//                                        for different arguments different services has to be provided.
	
	public List<String> retrieveTodos(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring mvc","Learn Mockito");
	}
	

}
