
import java.util.ArrayList;
import java.util.List;

 public class Main {

        public static void main(String[] args) {

            List<Animal> myAnimals = new ArrayList<>();
            myAnimals.add(new Dog());
            myAnimals.add(new Cat());
            myAnimals.add(new Mouse());

            for (Animal myAnimal: myAnimals )
            {
                myAnimal.makeSound();
            }
        }
    }
