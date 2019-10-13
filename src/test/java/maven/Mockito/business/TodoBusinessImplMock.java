package maven.Mockito.business;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import maven.Mockito.data.api.TodoService;
import maven.Mockito.data.api.TodoServiceStub;

public class TodoBusinessImplMock {

	@Test
	public void testRetrieveTodosRelatedToSpring_using_Manikandan() {
		TodoService todoService = mock(TodoService.class);
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan")).thenReturn(todosList);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_using_Manikandan1() {
		TodoService todoService = mock(TodoService.class);
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan1")).thenReturn(todosList);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan1");
		assertEquals(1, todos.size());
	}
	
	@Test
	public void testRetrievedTodosRelatedToSpring_using_Manikandan() {
		TodoService todoService = mock(TodoService.class);
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan")).thenReturn(todosList);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan");
		String []values = {"Learn Spring","Learn Spring MVC"};
		assertArrayEquals(values, todos.toArray());
	}
	
	@Test
	public void testRetrievedTodosRelatedToSpring_using_Manikandan1() {
		TodoService todoService = mock(TodoService.class);
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan1")).thenReturn(todosList);
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan1");
		String []values = {"Learn Hibernate"};
		assertArrayEquals(values, todos.toArray());
	}

}
