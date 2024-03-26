
# Java Inheritance and Method Overriding Activity

## Objective
Enhance your understanding of inheritance, method overriding, constructors, and `toString` methods in Java.

## Background
You've learned about class hierarchies, inheritance, and method overriding. In this activity, you'll apply these concepts by extending a simple class hierarchy involving animals. You'll add new features to your subclasses, including instance variables, constructors, and custom `toString` methods.

## Task
1. **Add Features to Existing Hiearchy: "
    - Add instance variable to `Animal` classes
    - Create and update constructors in `Animal`, `Dog`, and `Cat` classes
    - Add `toString` methods to `Animal`, `Dog`, and `Cat` classes
2. **Create a New Subclass:**
   - Create a subclass of `Animal` called `Bird`.
   - Add an instance variable `color` of type `String` to the `Bird` class.
   - Create a constructor in the `Bird` class that accepts a `String` parameter to set the `color` of the bird.
   - Override the `makeSound` method to output a message that includes the bird's color (e.g., "A blue bird chirps").

2. **Implement a toString Method:**
   - In the `Bird` class, override the `toString` method to return a string that describes the bird, including its color and the sound it makes.

3. **Demonstrate in Main:**
   - In your `Main` class, instantiate a `Bird` object with a color of your choice.
   - Call `makeSound` and `toString` on your bird object and print the results to the console.

4. **Add Instance Method to Animal:**
    - Add an instance method to `Animal` class
    - Demonstrate how it can be used by a `Bird` object

## Starter Code
```java
// Base class Animal
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Bird class extends Animal
class Bird extends Animal {
    private String color; // Instance variable for the color of the bird

    // Constructor for Bird class
    public Bird(String color) {
        this.color = color;
    }

    // Override the makeSound method
    @Override
    public void makeSound() {
        // Output should include the color of the bird
    }

    // Override the toString method
    @Override
    public String toString() {
        // Return a string describing the bird
        return "";
    }
}

// Main class to demonstrate the functionality
public class Main {
    public static void main(String[] args) {
        Bird myBird = new Bird("green"); // Create a Bird object with color green
        myBird.makeSound();
        System.out.println(myBird); // This will invoke the toString method
    }
}
```

## Questions
- How does the constructor in the `Bird` class enhance the object instantiation process?
- How does the `toString` method improve the representation of an object when it's printed?
- Can you modify the `Animal` class to include an instance variable and modify its constructor and `toString` method? How does this change propagate to its subclasses?
