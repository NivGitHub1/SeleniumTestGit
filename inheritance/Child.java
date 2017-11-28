package day1.inheritance;

public class Child extends Parent {
	
	int k = 30;
	
	public void m3() {
		System.out.println("In Child's m3()");
	}
	
	public static void main (String[] args) {
		
		System.out.println("Child's object ...");
		
		Child c1 = new Child();
		c1.m1();
		c1.m2();c1.m3();
		System.out.println(c1.i + "--" + c1.j + "--" + c1.k);
		
		System.out.println("Parent's object ...");
		Parent p1 = new Parent(); {
			p1.m1();
			p1.m2();
			System.out.println(p1.i + "--" + p1.j);
			
			//p1.m3()	//not allowed here because m3 is applicable to only Child class, not Parent class
			
		}
		
	}


}
