package com.utils;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyStringUtilsTest {

	MyStringUtils msu; 
	
	@Before
	public void init(){
		msu = new MyStringUtils();  
	}
	
	@Test
	public void testTruncateFirst2Pos_AinFirstChar() {
		assertEquals("AACD", "CD", msu.truncateFirstTwoPos("AACD"));
		assertEquals("ACD", "CD", msu.truncateFirstTwoPos("ACD"));
		assertEquals("A", "", msu.truncateFirstTwoPos("A"));
		assertEquals("", msu.truncateFirstTwoPos("A"));
	}
	
	@Test
	public void testTruncateFirst2Pos_AsecondChar(){
		assertEquals("DACD", "DCD", msu.truncateFirstTwoPos("DACD"));
	}
	
	@Test
	public void testTruncateFirst2Pos_EmptyString(){
		assertEquals("", "", msu.truncateFirstTwoPos(""));
	}
	
	
	@Test
	public void testAreFirst2CharAndLast2TheSame_(){
		assertEquals(true, msu.areFirst2CharAndLast2TheSame("ABAB"));
		assertEquals(false, msu.areFirst2CharAndLast2TheSame("ABCD"));
		assertEquals(false, msu.areFirst2CharAndLast2TheSame("ABBA"));
	}

}
