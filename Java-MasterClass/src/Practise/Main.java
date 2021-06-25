package Practise;

public class Main {

	public static void main(String[] args) {
		
		double miles = SpeedConverter.toMilesPerHour(10.5);
		System.out.println("Miles = " + miles);
		
		SpeedConverter.printConversion(10.5);
		
		MegaBytesConverter.printMegaBytesAndKileBytes(5000);
		BarkingDog.shouldWakeUp(true, 1);
		boolean LP = LeapYear.isLeapYear(1855);
		System.out.println(LP);
		boolean DC = DecimalConverter.areEqualByThreeDecimalPlaces(3.175, 3.176);
		System.out.println(DC);
		boolean EC = EqualSumChecker.hasEqualSum(1, 1, 2);
		System.out.println(EC);
		boolean TN = TeenNumberChecker.isTeen(13);
		System.out.println(TN);
		boolean TN1 = TeenNumberChecker.hasTeen(22,23,24);
		System.out.println(TN1);
		double CM = MethodOverloading_Example.caclFeelAndInchesToCentimeters(7, 5, 0);
		System.out.println(CM);
		double CM1 = MethodOverloading_Example.caclFeelAndInchesToCentimeters(2);
		System.out.println(CM1);
		double area = AreaCalculator.area(8.5);
		System.out.println(area);
		double area1 = AreaCalculator.area(-1.0, 4.0);
		System.out.println(area1);
		MinutesToYearsandDaysCalculator.printYearsAndDays(-1);
		EqualityPrinter.printEqual(1, 1, 3);
		boolean Cat = PlayingCat.iscatplaying(true, 10);
		System.out.println(Cat);
		

	}

}
