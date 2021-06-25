package Practise;

public class AreaCalculator {
	
	public static double area(double a) {
		if(a < 0) {
			System.out.println("Invalid Value");
		}
		double area = Math.PI * a*a;
		return area;
	}
	
	public static double area(double x , double y) {
		if(x < 0 || y< 0) {
			return -1;
		}
		double rectangle = x*y;
		return rectangle;
	}

}
