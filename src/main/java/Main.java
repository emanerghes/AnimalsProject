
import java.util.ArrayList;
import java.util.List;

 public class Main {

        public static void main(String[] args) {

            List<Animal> myAnimals = new ArrayList<>();
            myAnimals.add(new Dog("Labrador", "Ham"));
            myAnimals.add(new Cat("Siamese", "Meow"));
            myAnimals.add(new Mouse("White-Footed", "Chitz"));

            for (Animal myAnimal: myAnimals )
            {
                myAnimal.makeSound();
            }
        }
    }
