package com.utils;

public class MyArrayUtils {
	
	public int[] sort(int[] array){
		int limit = array.length-1;
		
		while(limit >= 1){
			for(int curr = 0, next = 1, tmp = 0; next<=limit; curr++, next++){
				if(array[curr] > array[next]){
					tmp = array[curr];
					array[curr] = array[next];
					array[next] = tmp;
				}
			}
			limit--;
		}
		return array;
	}
}
