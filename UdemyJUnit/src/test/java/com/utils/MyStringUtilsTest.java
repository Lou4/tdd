package com.utils;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyStringUtilsTest {

	private MyStringUtils msu; 
	
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
		msu = new MyStringUtils();  
	}
	
	@After
	public void clear(){
		msu = null;
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
	public void testAreFirst2CharAndLast2TheSame_MoreThen2CharPositiveScenario(){
		assertTrue(msu.areFirst2CharAndLast2TheSame("ABAB"));
		assertTrue(msu.areFirst2CharAndLast2TheSame("BBB"));
		assertTrue(msu.areFirst2CharAndLast2TheSame("AB"));
	}
	
	@Test
	public void testAreFirst2CharAndLast2TheSame_MoreThen2CharNegativeScenario(){
		assertFalse(msu.areFirst2CharAndLast2TheSame("ABCD"));
		assertFalse(msu.areFirst2CharAndLast2TheSame("ABBA"));
		assertFalse(msu.areFirst2CharAndLast2TheSame("ABB"));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAreFirst2CharAndLast2TheSame_LessThen2CharExpectedException(){
		msu.areFirst2CharAndLast2TheSame("A");
		msu.areFirst2CharAndLast2TheSame("");
	}
	
	@Test
	public void testIsPalindrome_NegativeScenario(){
		assertFalse("String computate ad palindrome but it isn't", msu.isPalindrome("OTTI"));
		assertFalse(msu.isPalindrome("OTT"));
		assertFalse(msu.isPalindrome("OT"));
		assertFalse(msu.isPalindrome("Rise to vote Sir!"));
		assertFalse(msu.isPalindrome("OTT,O"));
		
	}

	@Test
	public void testIsPalindrome_PositiveScenario(){
		assertTrue(msu.isPalindrome("OTtO"));
		assertTrue(msu.isPalindrome("OTTO"));
		assertTrue(msu.isPalindrome("O TT   O"));
		assertTrue(msu.isPalindrome("OTO"));
		assertTrue(msu.isPalindrome("OO"));
		assertTrue(msu.isPalindrome("O"));
		assertTrue(msu.isPalindrome(""));
		assertTrue(msu.isPalindrome("AI lati d Italia"));
		assertTrue(msu.isPalindrome("Rise to vote Sir"));
	}
	
	@Test
	public void testIsPalindrome_nullString(){
		assertFalse(msu.isPalindrome(null));
	}
}
