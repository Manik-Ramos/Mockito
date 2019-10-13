package maven.Mockito.business;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import maven.Mockito.data.api.TodoService;
import maven.Mockito.data.api.TodoServiceStub;

@RunWith(MockitoJUnitRunner.class)
public class TodoBusinessImplMock {
	
	@Mock
	TodoService todoService;
	
	@InjectMocks
	TodoBusinessImpl todoBusinessImpl;
	
/*	@Captor
	ArgumentCaptor<String> stringArgumentCaptor;*/
	
	@Test
	public void testRetrieveTodosRelatedToSpring_using_Manikandan() {
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan")).thenReturn(todosList);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan");
		assertEquals(2, todos.size());
	}
	
	@Test
	public void testRetrieveTodosRelatedToSpring_using_Manikandan1() {
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan1")).thenReturn(todosList);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan1");
		assertEquals(1, todos.size());
	}
	
	@Test
	public void testRetrievedTodosRelatedToSpring_using_Manikandan() {
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan")).thenReturn(todosList);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan");
		String []values = {"Learn Spring","Learn Spring MVC"};
		assertArrayEquals(values, todos.toArray());
	}
	
	@Test
	public void testRetrievedTodosRelatedToSpring_using_Manikandan1() {
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		when(todoService.retrieveTodos("Manikandan1")).thenReturn(todosList);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan1");
		String []values = {"Learn Hibernate"};
		assertArrayEquals(values, todos.toArray());
	}
	
	@Test
	public void testRetrievedTodosRelatedToSpring_using_BDD() {
		//Given - contains all setup for the test
		List<String> todosList = Arrays.asList("Learn Spring","Learn Spring MVC","Learn Hibernate");
		given(todoService.retrieveTodos("Manikandan1")).willReturn(todosList);
		String []values = {"Learn Hibernate"};
		
		//When - holds the call to the method
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Manikandan1");
		
		//Then - Assertion
		assertThat(todos.get(0), is(values[0]));
	}
}
