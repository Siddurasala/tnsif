package Inheritance;

public class HierarchicalInheritance {
	 public static void main(String[] args) {
	     Car car = new Car("Toyota", 4, 4);
	     Bike bike = new Bike("Yamaha", 2, true);

	     System.out.println("--- Car Details ---");
	     car.carDetails();

	     System.out.println("\n--- Bike Details ---");
	     bike.bikeDetails();
	 }
	}

