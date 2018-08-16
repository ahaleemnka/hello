package com.nissan.training.hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalc {

	@Test
	public void testAdd() {
		Calc c=new Calc();
		assertEquals(10, c.add(5, 5));
	}

	@Test
	public void testSub(){
		Calc c=new Calc();
		assertEquals(3, c.sub(7, 4));
	}
	
	@Test
	public void testMul(){
		Calc c=new Calc();
		assertEquals(10, c.mult(2, 5));
	}
	
	@Test
	public void testDiv(){
		Calc c=new Calc();
		assertEquals(4, c.div(8,2));
	}
	
}
