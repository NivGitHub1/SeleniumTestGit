package day1.exercise1;

public class ForLoopToFindSumOf100 {
	//write a program to find sum of first 100 numbers
	
	public static void main(String[] args) {
		int maxNum = 100;
	//	int sum=1;
		for (int i = 1; i <= maxNum; i++) {
			i = i+i;
			System.out.print(i);
		}

	}

}
