package Practise;

public class EqualityPrinter {
	
	public static void printEqual(int a, int b , int c) {
		if((a < 0) || (b < 0) ||( c<0)) {
			System.out.println("Invalid Value");
		}
		else if ((a == b) && (b == c) && (c == a)) {
			System.out.println("All are equal");
		}
		else if ((a !=b)&& (a!=c) && (c !=b))
		{
			System.out.println("All are different");
		}
		else {
			System.out.println("Neither all are equal or different");
		}
	}
	

}