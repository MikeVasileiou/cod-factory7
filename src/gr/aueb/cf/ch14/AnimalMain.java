package gr.aueb.cf.ch14;

import gr.aueb.cf.ch14.services.Dog;

public class AnimalMain {

    public static void main(String[] args) {
        Dog dog = new Dog("Griv", 2, "Maltese");
        dog.makeSound();
        dog.searchForFood();

        doMakeSound(dog);
    }

    public static void doMakeSound(Animal animal) {
        animal.makeSound();
    }
}
