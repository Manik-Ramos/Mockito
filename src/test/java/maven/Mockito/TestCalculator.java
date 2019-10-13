package maven.Mockito;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculator {
	Calculator c = null;
	
	@Before
	public void initialSetup(){
		c = new Calculator();
	}
	
	@Test
	public void testAdd(){
		assertEquals(5,c.add(2, 3));		
	}
	
	@Test
	public void testDifference(){
		//assertEquals(1,c.differenct(2, 3));
		assertEquals(3,c.difference(2, 5));
	}
	
	@After
	public void finalSetup(){
		
	}
}
