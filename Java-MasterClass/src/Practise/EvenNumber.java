package Practise;

public class EvenNumber {

	public static void main(String[] args) {
		int number = 4;
		int finishnumber = 20;
		int evenNumbersFound = 0;
		
		while(number <=finishnumber) {
			number++;
			if(!isEvenNumber(number)) {
				continue;
			}
			System.out.println("Even number" + number);
			
			evenNumbersFound++;
			if(evenNumbersFound >=5)
			{
				break;
			}
			
		}
		
		System.out.println("Total even numbers found = " + evenNumbersFound);

	}
	
	public static boolean isEvenNumber(int number)
	{
		if((number % 2) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
