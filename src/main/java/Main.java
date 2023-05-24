//Se creaza si  adauga intr-o lista 3 animale de tip Cat, Dog, Mouse
//Iterand lisa animalelor se apeleaza metoda clasei de baza: makeSound pentru fiecare animal

import java.util.ArrayList;
import java.util.List;

public class Main {

        public static void main(String[] args) {

            List<Animal> myAnimals = new ArrayList<Animal>();
            myAnimals.add( new Dog("Bobby", "Woof", "Labrador"));
            myAnimals.add( new Cat("Bella","Meow", "Tabby"));
            myAnimals.add( new Mouse("Jerry", "Chitz", 1, true));

            for (Animal myAnimal: myAnimals )
            {
                myAnimal.makeSound();
            }
        }
    }
