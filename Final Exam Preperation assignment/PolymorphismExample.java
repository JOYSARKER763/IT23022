// Superclass
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class PolymorphismExample {
    public static void main(String[] args) {
        Animal myAnimal;  // Superclass reference

        myAnimal = new Dog();  // Dog object assigned
        myAnimal.makeSound();  // Output: Dog barks

        myAnimal = new Cat();  // Cat object assigned
        myAnimal.makeSound();  // Output: Cat meows
    }
}

