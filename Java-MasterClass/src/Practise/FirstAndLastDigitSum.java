package Practise;

public class FirstAndLastDigitSum {

	public static void main(String[] args) {
		int sum = sumFirstAndLastDigit(279);
		System.out.println(sum);

	}
	
	public static int sumFirstAndLastDigit(int number) {
		if(number >= 0)
		{
			int firstNumber = 0;
			int lastNumber = number % 10;
			int originalNumber = number;
			
			if (number < 10)
			{
				firstNumber = lastNumber;
			}
			else
			{
			while(number > 1)
			{
				number = number/10;
				if(number == 0) {
					break;
				}
				firstNumber = number;
			}
		}
		
			return (firstNumber + lastNumber);
	}
		return -1;
	}

}
