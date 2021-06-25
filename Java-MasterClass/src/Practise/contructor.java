package Practise;

public class contructor {
	
	
	contructor(){
		
		int a = 1;
		int b = 1;
		int c = a+b;
		
		System.out.println("Addition of a+b is :" +c );	
	}
	
    public contructor(double a, double b){
    	
		double c = a+b;
		
		System.out.println("Addition of a+b is :" +c );	
		
	}
    private contructor(double a, double b, double c){ // This is also a constructor overloading.
    		double d = a+b+c;
		
		System.out.println("Addition of a+b is :" +d );	
		
	}
    protected contructor(double a){
    	a = 1.0;
		
		
		System.out.println("Value is" +a);	
		
	}
    
	// create 4 constructor for all access specifier and add paramenter. 1. Add 2. add float 3. add double 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		contructor c = new contructor(); // Object created
		contructor d = new contructor(1.0,2.0);
		contructor e = new contructor(1.0,2.0,4.0);
		
	}

}
