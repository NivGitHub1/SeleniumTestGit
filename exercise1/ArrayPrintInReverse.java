package day1.exercise1;

public class ArrayPrintInReverse {
//make an integer array and print it in reverse order
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		for (int i = 4; i >= 0; i--) {
		
		System.out.println(arr[i]);

		
		}
	}
	
}
