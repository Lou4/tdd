package main;

public class Numbers {
	
	private String[] romansValue = {"I"};
	private int[] arabicValue = {1};
	private int curr = 0;
	private int prev = -1;
	
	public String conversionA2R(String arabic){
		String roman = "";
		int a = Integer.parseInt(arabic);
		
		while(arabicValue[curr] <= a){
			roman += romansValue[curr];
			a -= arabicValue[curr];
		}
		
		return roman;
	}
}
