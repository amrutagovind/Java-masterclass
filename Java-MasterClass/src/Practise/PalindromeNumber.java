package Practise;

public class PalindromeNumber {

	public static void main(String[] args) {
	 boolean palindrom = isPalindrome(11221);
	 System.out.println(palindrom);

	}
	
	public static boolean isPalindrome(int number) {
	int reverse = 0 , lastDigit;
	int origninalNum = number;
	 
	while(number!=0) {
		lastDigit = number %10;
		reverse = reverse *10 + lastDigit;
		number = number/10;
	}
	
	if(origninalNum == reverse)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	}
	

}
