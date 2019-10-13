package maven.Mockito.data.api;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	public List<String> retrieveTodos(String user) {
		return Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
	}
}
