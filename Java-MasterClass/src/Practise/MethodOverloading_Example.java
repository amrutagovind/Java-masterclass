package Practise;

public class MethodOverloading_Example {

	public static double caclFeelAndInchesToCentimeters(double a, double b , double c) 
	{
	 if(a >=0 && b>=0 && b<=12)
		{
			b = (a*12)+8;
			c = b * 2.54;
			return c;
		}
		else
		{
			return -1;
		}
	  
	}
	
	public static double caclFeelAndInchesToCentimeters(double x) {
		if(x>=0) {
			x = x*12;
			return x;
		}
		else
		{
			return -1;
		}
	}
}

