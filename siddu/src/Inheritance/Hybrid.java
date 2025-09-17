package Inheritance;

public class Hybrid {

	public static void main(String[] args) {
		System.out.println("Dog");
        Dog d = new Dog();
        d.eat();   // from Animal
        d.walk();  // from Mammal
        d.bark();  // from Dog

        // Hierarchical inheritance demo
        System.out.println("\nBird");
        Bird b = new Bird();
        b.eat();   // from Animal
        b.fly();   // from Bird
    }
}
