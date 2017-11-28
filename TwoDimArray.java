package day1;

public class TwoDimArray {
	
	public static void main (String[] args){
		int[][] twoDimArray=new int[3][4];
		
		//Assign
		//First row
		
		twoDimArray[0][0]=100;
		twoDimArray[0][1]=101;
		twoDimArray[0][2]=102;
		twoDimArray[0][3]=103;

		// Second row
		
		twoDimArray[1][0]=200;
		twoDimArray[1][1]=201;
		twoDimArray[1][2]=202;
		twoDimArray[1][3]=203;
	
	// Third row
		
		twoDimArray[2][0]=300;
		twoDimArray[2][1]=301;
		twoDimArray[2][2]=302;
		twoDimArray[2][3]=303;
		
		for (int i = 0; i < twoDimArray.length; i++) {
			for (int j = 0; j < twoDimArray.length; j++){
				
				System.out.print(twoDimArray[i][j] +  " ");
			}
				System.out.println();
		}
	}
	
}
