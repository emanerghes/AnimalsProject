//Se creaza si  adauga intr-o lista 3 animale de tip Cat, Dog, Mouse
//Iterand lisa animalelor se apeleaza metoda clasei de baza: makeSound pentru fiecare animal

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Animal> myAnimals = new ArrayList<Animal>();
        myAnimals.add(new Dog("Labrador", "Ham"));
        myAnimals.add(new Cat("Siamese", "Meow"));
        myAnimals.add(new Mouse("White-Footed", "Chitz"));

        for (Animal myAnimal : myAnimals) {
            myAnimal.makeSound();
        }
    }
}
