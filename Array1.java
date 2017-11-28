package day1;

public class Array1 {
	
	public static void main(String[] args){

	int[] intArr = new int [5];
	System.out.println("Size of Array1 --" + 
			intArr.length);
	//array initialization
	
	intArr[0]=100;
	intArr[1]=101;
	intArr[2]=102;
	intArr[3]=103;
	intArr[4]=104;
	
	//System.out.println(intArr[4]);
	
	for (int i = 0; i<intArr.length; i++){
		System.out.println(intArr[i]);
	}
	
	
	}
}
