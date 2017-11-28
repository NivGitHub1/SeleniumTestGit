package day1.exercise1;

public class PrintAlternateElementsOfStringArray {
	//print alternate elements of String Array
	
	public static void main(String[] args) {
		String[] stringArray = new String[10];
		
		stringArray[0] = "One";
		stringArray[1] = "Two";
		stringArray[2] = "Three";
		stringArray[3] = "Four";
		stringArray[4] = "Five";
		stringArray[5] = "Six";
		stringArray[6] = "Seven";
		stringArray[7] = "Eight";
		stringArray[8] = "Nine";
		stringArray[9] = "Ten";
		
		System.out.println("Alternate elements of String Array:");
		System.out.println(stringArray[0]);
		System.out.println(stringArray[2]);
		System.out.println(stringArray[4]);
		System.out.println(stringArray[6]);
		System.out.println(stringArray[8]);
		
	}
	

}
