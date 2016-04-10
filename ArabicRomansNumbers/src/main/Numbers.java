package main;

public class Numbers {
	
	private String[] romansValue = {"I", "IV", "V", "IX", "X"};
	private int[] arabicValue = {1, 4, 5, 9, 10};
	
	
	public String conversionA2R(String arabic){
		int curr = romansValue.length-1;
		String roman = "";
		int a = Integer.parseInt(arabic);
		
		while(curr >= 0){
				
			while(arabicValue[curr] <= a){
				roman += romansValue[curr];
				a -= arabicValue[curr];
			}
			curr--;
		}
		return roman;
	}
}
