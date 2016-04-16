package com.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayUtilsTest {
	
	private MyArrayUtils myArrayUtils;
	
	@Before
	public void setup(){
		myArrayUtils = new MyArrayUtils();
	}
	
	@Test
	public void testArraySort_NotNullValue(){
		assertArrayEquals(new int[]{1, 2, 3}, myArrayUtils.sort(new int[]{2, 1, 3}));
	}
}
