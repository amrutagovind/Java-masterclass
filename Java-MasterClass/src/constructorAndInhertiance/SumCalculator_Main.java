package constructorAndInhertiance;

public class SumCalculator_Main {

	public static void main(String[] args) {
		SumCalculator calculator = new SumCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add " + calculator.getAdditionResult());
		System.out.println("substract " +calculator.getSubtractionResult());
		System.out.println("Multiplication " + calculator.getMultiplicationResult());
		System.out.println("Division " + calculator.getDivisionResult());
		

	}

}
