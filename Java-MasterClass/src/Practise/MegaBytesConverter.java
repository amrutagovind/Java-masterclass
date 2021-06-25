package Practise;

public class MegaBytesConverter {
	
	public static void printMegaBytesAndKileBytes(int kiloBytes)
	{
		int Megabytes = kiloBytes/1024;
		int remaingKiloBytes =  kiloBytes % 1024;
		
		if(kiloBytes < 0)
		{
			System.out.println("Invalid Value");
		}
		else
		{
			System.out.println(kiloBytes + "KB" + " = " + Megabytes + "MB" + " and " + remaingKiloBytes + "KB");
		}
	}

}
