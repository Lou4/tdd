package com.utils;

import java.util.Arrays;
import java.util.List;

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
	
	/* ABCD => false, ABAB => true*/
	public Boolean areFirst2CharAndLast2TheSame(String str){
		if(str.length() < 2) throw new IllegalArgumentException("String must be at least 4 chars length");
		
		int strLen = str.length();
		return str.subSequence(0, 2).equals(str.subSequence(strLen-2, strLen));
	}

	/* OTTO => true */
	public boolean isPalindrome(String string) {
		string  = string.toLowerCase();
		
		for(int i = string.length()-1, j = 0; i>=0; i--, j++){
			if(string.charAt(i) == ' ') i--;
			if(string.charAt(j) == ' ') j++;
			if(string.charAt(i) != string.charAt(j)) return false;
		}
		return true;
	}

}
