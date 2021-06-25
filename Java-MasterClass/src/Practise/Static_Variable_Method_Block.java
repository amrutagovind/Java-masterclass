package Practise;

public class Static_Variable_Method_Block {
	
	static int a=10;
	
	Static_Variable_Method_Block(){
		 System.out.println("This is default constructor");	
	}
	
	static
	{
		System.out.println("This is static Block");
	}
	
	public static void display() {
		
		System.out.println("This is static method");
		
	}
	
	public static void main(String[] args) {
		// By default static block will be called 
		System.out.println(a);
		Static_Variable_Method_Block t = new Static_Variable_Method_Block();
		display();
		
	}

}
