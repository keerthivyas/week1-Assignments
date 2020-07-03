package week1.day1;

public class Car {

	
	private static final boolean True = false;
	short noTyres = 4 ;
	int seats = 5 ;
	long carNumber = 57575657656l ;
	float fuelDensity = 244.5455f ;
	double manuNumber = 3.655776676 ;
	char colour = 'R' ;
	boolean isPetrol = True ;
	String carName = "I20" ;

	public static void main(String[] args) {
		Car objects = new Car();
		System.out.println(objects.noTyres);
		System.out.println(seats);
		System.out.println(objects.carNumber);
		System.out.println(objects.fuelDensity);
		System.out.println(objects.manuNumber);
		System.out.println(objects.colour);
		System.out.println(objects.isPetrol);
		System.out.println(objects.carName);

	}

}
