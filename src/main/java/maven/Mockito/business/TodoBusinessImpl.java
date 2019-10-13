package maven.Mockito.business;

import java.util.ArrayList;
import java.util.List;
import maven.Mockito.data.api.TodoService;

public class TodoBusinessImpl {
	private TodoService todoService;

	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodosRelatedToSpring(String userName){
		List<String> filteredTodos = new ArrayList<String>();
		List<String> todos = todoService.retrieveTodos(userName);
		
		for(String todo:todos){
			if("Manikandan".equals(userName)){
				if(todo.contains("Spring")){
					filteredTodos.add(todo);
				}
			} else {
				if(!(todo.contains("Spring"))){
					filteredTodos.add(todo);
				}
			}
		}
		return filteredTodos;
	}	
}
