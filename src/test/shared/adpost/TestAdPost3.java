package test.shared.adpost;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestAdPost3{
	protected int a;
	protected int b;
	
	@Before
	public void setUp(){
		a=1;
		b=1;
	}
	
	
	@Test
	public void f1(){
				
		assertEquals(true, a==b);
	}
	
	@Test
	public void f2(){
		int s = a+b;
		assertTrue(s==2);
	}
}
