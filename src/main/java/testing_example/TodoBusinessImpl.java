package testing_example;

import java.util.ArrayList;
import java.util.List;

//Basically what we are trying to do:-
//
//We are given an interface TodoService.....This we dont know......but the interface has a method 
//retrueveTodos() which
//returns list of todos of a particular user.
//we are interested in retrieving only those todos which has got "Spring" in them.

public class TodoBusinessImpl {
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String user){
		List<String> filteredTodos= new ArrayList<String>();
		List<String> todos= todoService.retrieveTodos(user);
		for(String todo:todos) {
			if(todo.contains("Spring")) {
				filteredTodos.add(todo);
			}
		}
		return filteredTodos;
	}

}
