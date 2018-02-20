package test.shared.adpost;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.adogo.advertiser.entity.adpost.AdPost;

import junit.framework.TestCase;

//public class TestAdPost2 extends TestCase{

public class TestAdPost2{

	protected int a;
	protected int b;
	
	protected void setUp(){
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
		System.out.println("s="+s);
		assertTrue(s==2);
	}
	
	@Test
	public void f3(){
			
		assertFalse(a==b);
	}
	
	@Test
	public void f4(){
				
		assertNotNull(a);
	}
	
	@Test
	public void f5(){
		AdPost adpost = null;
		
		assertNull(adpost);
	}
	
	@Test
	public void f6(){
		AdPost adpost = new AdPost();
		AdPost adpost2 = new AdPost();
		
		assertSame(adpost,adpost2);
	}
	
	@Test
	public void f7(){
		AdPost adpost = new AdPost();
		AdPost adpost2 = adpost;
		
		assertSame(adpost,adpost2);
	}
	
}
