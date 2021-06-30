package constructorAndInhertiance;

public class Car_Main {

	public static void main(String[] args) {
		Car porshe = new Car();
		Car holden = new Car();
		porshe.setModel("Audi");
		System.out.println("Model is " + porshe.getModel());
	}

}
