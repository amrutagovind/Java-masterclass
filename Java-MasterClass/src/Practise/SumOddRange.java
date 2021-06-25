package Practise;

public class SumOddRange {

	public static void main(String[] args) {
		boolean odd = isOdd(-1);
		System.out.println(odd);
		int odd1 = sumOdd(-1, 100);
		System.out.println(odd1);

	}
	
	public static boolean isOdd(int number) {
		if((number > 0) && (number % 2 != 0))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int sumOdd(int start , int end)
	{
		int sumOfOddNumber = 0;
		
		if((start > 0) && (end > 0)&& (end >= start))
		{
			for(int i = start ; i <= end ; i++ )
			{
				if(isOdd(i))
				{
					sumOfOddNumber = sumOfOddNumber + i;
				}
			}
			return sumOfOddNumber;
		} else
		{
			return -1;
		}
		
	}

}
