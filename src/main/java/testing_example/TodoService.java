package testing_example;

import java.util.List;

//Since we dont have the implementation of TodoService
//
//we have to make a stub and test it

public interface TodoService {
	
	public List<String> retrieveTodos(String user);

}


