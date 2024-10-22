 //Base class Animal
 class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

//Subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

//Subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

//Subclass Bird
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }
}

//Main class to run the program
public class Main {
    public static void main(String[] args) {
        //Create an array of Animal objects
        Animal[] animals = new Animal [3];

        //Store Dog,Cat, and Bird objects in the array
        animals [0] = new Dog();
        animals [1] = new Cat();
        animals [2] = new Bird();

        //Iterate through the array and call makeSound() method for each object
        for (Animal animal : animals) {
            animal.makeSound(); // Polymorphism in action
        }
    }
}
