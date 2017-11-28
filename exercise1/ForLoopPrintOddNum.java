package day1.exercise1;

public class ForLoopPrintOddNum {
	//create a program using For loop, to print Odd numbers between 1 and 100
	
	public static void main(String[] args) {
		
		int maxNum = 100;
		
		System.out.println("Odd numbers between 1 and 100 are:");
		for (int i = 1; i <= maxNum; i++) {
			if (i % 2 !=0) {
				System.out.println(i + " ");
			}
		}
		
	}
	

}
