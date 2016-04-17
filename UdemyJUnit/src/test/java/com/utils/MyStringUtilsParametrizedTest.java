package com.utils;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MyStringUtilsParametrizedTest {
	
	private MyStringUtils myStringUtils = new MyStringUtils();
	private String input;
	private String expectedOutput;
	
	public MyStringUtilsParametrizedTest(String input, String expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	@Parameters
	public static Collection<String[]> testConditions(){
		String [][] expectedOutputs = {{"AACD", "CD"}, {"ACD", "CD"}, {"CD", "CD"}};
		return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateFirstTwoPos_parametrized(){
		assertEquals(expectedOutput, myStringUtils.truncateFirstTwoPos(input));
	}
}
