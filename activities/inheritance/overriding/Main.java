// Main class to demonstrate overriding in action
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Create an Animal object
        Animal myDog = new Dog();        // Create a Dog object
        Animal myCat = new Cat();        // Create a Cat object
        
        // Call the makeSound method on all the objects
        myAnimal.makeSound();
        myDog.makeSound();
        myCat.makeSound();
    }
}