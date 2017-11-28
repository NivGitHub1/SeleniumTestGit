package day1;

public class Local_Global_Variables {
	
	//global variable
	int i=10;
	
	public void m1(){
		
		//local variable
		int i=20;
		
		System.out.println(i);
		
	}
	public void m2(){
		
		System.out.println(i);
	}
	

	public static void main (String[] args){
		
		Local_Global_Variables obj1 = new Local_Global_Variables();{
		obj1.m1();
		obj1.m2();
			
		}
				
	}
	
}
