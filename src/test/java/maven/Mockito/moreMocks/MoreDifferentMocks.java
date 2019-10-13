package maven.Mockito.moreMocks;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.util.List;

import org.junit.Test;
@SuppressWarnings("unchecked")
public class MoreDifferentMocks {

	//Mocks for List Interface
	
	//size() method
	@Test
	public void testListSize() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(2);
		assertEquals(2,listMock.size());
	}
	
	//add() method
	@Test
	public void testListAdd() {
		List listMock = mock(List.class);
		
		when(listMock.add(anyString())).thenReturn(true);
		when(listMock.add(anyInt())).thenReturn(false);
		when(listMock.add(anyFloat())).thenReturn(true);
	
		assertEquals(true,listMock.add("abc"));
		assertEquals(false,listMock.add(1));
		assertEquals(true,listMock.add(1.0f));
	}
	
	//Multiple returns
	@Test
	public void testMultipleReturns() {
		List listMock = mock(List.class);
		when(listMock.add(anyString())).thenReturn(true).thenReturn(false);
		assertEquals(true,listMock.add("abc"));
		assertEquals(false,listMock.add("xyz"));
	}
	
	//Throw Exception
	@Test(expected=RuntimeException.class)
	public void testException() {
		List listMock = mock(List.class);
		when(listMock.add(anyInt())).thenThrow(new RuntimeException("Exception"));
		listMock.add(1);
	}
}
