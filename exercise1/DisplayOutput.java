package day1.exercise1;

public class DisplayOutput {
	/*write a program to display out put as;
		1
		12
		123
		1234
		12345
		123456
		1234567
	*/	
	public static void main(String[] args) {
		
		String[] arr = new String[7];
		
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "4";
		arr[4] = "5";
		arr[5] = "6";
		arr[6] = "7";
		
		System.out.println(arr[0]);
		System.out.println(arr[0]+arr[1]);
		System.out.println(arr[0]+arr[1]+arr[2]);
		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]);
		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]);		
		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]);
		System.out.println(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]+arr[6]);
		
	}
	
	
	
}
