package maven.Mockito.business;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;
import maven.Mockito.data.api.TodoService;
import maven.Mockito.data.api.TodoServiceStub;

public class TodoBusinessImplStub {

	@Test
	public void testRetrieveTodosRelatedToSpring() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void testRetrievedTodosRelatedToSpring() {
		TodoService todoService = new TodoServiceStub();
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan");
		String []values = {"Learn Spring","Learn Spring MVC"};
		assertArrayEquals(values, todos.toArray());
	}

}
