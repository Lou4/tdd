package com.utils;

public class MyStringUtils {

	/* AACD -> CD, CACD -> CCD*/
	public String truncateFirstTwoPos(String str) {
		String tmp = "";
		
		for(int i = 0; i<str.length(); i++){
			if(i < 2 && str.charAt(i) != 'A') tmp += str.charAt(i);
			else if(i>=2) tmp += str.charAt(i);
			
		}
		return tmp;
	}

}
