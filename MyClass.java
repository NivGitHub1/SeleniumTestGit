package day1;

public class MyClass {
	
	int i = 10;
//	int i;		// declaration
//	i=10;		// assignment
	
	String city = "Pune";
	
	public void printI(){
		System.out.println("Inside printI method --"+i);
		
	}
	public void printName(){
		System.out.println("Inside print name method. ");
		System.out.println(city);
		
	}
	
	public static void main (String[] args){
		System.out.println("First object ...");
		MyClass obj1 = new MyClass();
		obj1.printI();
		obj1.printName();
		System.out.println(obj1.i);
		
		System.out.println("Second Object ...");
		MyClass obj2 = new MyClass();
		obj2.city = "Mumbai";
		
		System.out.println(obj2.city);
		System.out.println(obj1.city);
		
	}

}
