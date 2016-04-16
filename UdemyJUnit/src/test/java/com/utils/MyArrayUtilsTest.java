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
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, myArrayUtils.sort(new int[]{5, 2, 1, 3, 4}));
		assertArrayEquals(new int[]{1, 2}, myArrayUtils.sort(new int[]{2, 1}));
		assertArrayEquals(new int[]{1}, myArrayUtils.sort(new int[]{1}));
	}
}
