package day1.exercise1;

public class ForLoopPrintEvenNum {
	//Write a for loop to print even numbers between 1 to 100
	
	public static void main(String[] args) {
	int maxNum = 100; // define max number integer
	System.out.println("Even numbers between 1 and 100:");	
	for (int i = 1; i <= maxNum; i++) {
		
		//check if value of number is divisible by 2.
		
		if(i % 2 == 0) {

			System.out.println(i + " ");
		}

	}
	
	
}

}
