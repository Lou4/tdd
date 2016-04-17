package com.utils;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyArrayUtilsTest {
	
	private MyArrayUtils myArrayUtils;
	
	@BeforeClass
	public static void start(){
		System.out.println("- - - TESTS BEGIN - - -");
	}
	
	@AfterClass
	public static void end(){
		System.out.println("- - - TESTS END - - -");
	}
	
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
	
	@Test(timeout=100)
	public void testArraySort_performance(){
		for(int i = 0; i<1000000; i++){
			myArrayUtils.sort(new int[]{5, 2, 1, 3, 4});
		}
	}
}
