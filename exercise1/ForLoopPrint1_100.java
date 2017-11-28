package day1.exercise1;

public class ForLoopPrint1_100 {
	//write a code to print numbers between 1 to 100, 
	//and if a number is divisible by 5, print a line "divisible by 5"
	
	public static void main(String[] args) {
		int maxNum = 100;
		
		for (int i = 1; i <= maxNum; i++) {
			System.out.println(i);
			if (i % 5 == 0) {
				System.out.print("(this is divisible by 5)");
				System.out.println("");
			}
		}
		
	}

}
