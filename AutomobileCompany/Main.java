package homework;

public class Main {

	public static void main(String[] args) {
		AutomobileCompany Hyundai = AutomobileCompany.getCompany();
		CalculationOfCarPrice sumPrice = new CalculationOfCarPrice(Hyundai);
		
		Sonata sonata1 = new Sonata();
		Sonata sonata2 = new Sonata();
		Sonata sonata3 = new Sonata();
		Grandeur grandeur1 = new Grandeur();
		Grandeur grandeur2 = new Grandeur();
		Genesis genesis1 = new Genesis();
		
		Hyundai.addCar(sonata1);
		Hyundai.addCar(sonata2);
		Hyundai.addCar(sonata3);
		Hyundai.addCar(grandeur1);
		Hyundai.addCar(grandeur2);
		Hyundai.addCar(genesis1);
		
		System.out.println("company hava " + Hyundai.countCar() + " cars");

		System.out.println("company hava " + sumPrice.getSumPrice() + " won");
	}

}
