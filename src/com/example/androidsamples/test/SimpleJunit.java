package com.example.androidsamples.test;

import org.junit.Test;

import com.example.androidsamples.Utils;

import junit.framework.TestCase;


public class SimpleJunit extends TestCase{
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	@Test
	public void testSum(){
		assertTrue(Utils.getSum(1, 2)==3);
		
	}

}
