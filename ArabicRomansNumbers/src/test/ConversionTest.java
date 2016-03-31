package test;

import static org.junit.Assert.assertEquals; 
import main.Numbers;

import org.junit.Test;

public class ConversionTest{

	private Numbers num;
	public ConversionTest() {
		num = new Numbers();
	}
	
	@Test
	public void arabicToRomanOne(){
		assertEquals("1", "I", num.conversionA2R("1"));
		assertEquals("2", "II", num.conversionA2R("2"));
		assertEquals("3", "III", num.conversionA2R("3"));
	}
	
	@Test
	public void arabicToRomanTwo(){
		assertEquals("5", "V", num.conversionA2R("5"));
		assertEquals("6", "VI", num.conversionA2R("6"));
		assertEquals("7", "VII", num.conversionA2R("7"));
	}
	
	@Test
	public void arabicToRomanThree(){
		assertEquals("10", "X", num.conversionA2R("10"));
		assertEquals("11", "XI", num.conversionA2R("11"));
		assertEquals("12", "XII", num.conversionA2R("12"));
		assertEquals("16", "XVI", num.conversionA2R("16"));
	}
}
