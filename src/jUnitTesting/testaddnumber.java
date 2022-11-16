package jUnitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		jUnitFunc obj = new jUnitFunc();
		int a = 10;
		int b = 10;
		assertEquals(20,obj.add_num(a, b));
		
	}
	
	@Test
	public void test1() {
		jUnitFunc obj = new jUnitFunc();
		int a = 10;
		int b = 10;
		assertEquals(10,obj.add_num(a, b));
		
	}

}
