    public class Main {
        public static void main(String[] args) {
            // Create instances of different animals
            Animal dog = new Dog("Bobby", "Woof", "Labrador");
            Animal cat = new Cat("Whiskers", "Meow", "Tabby");
            Animal mouse = new Mouse("Jerry", "Squeak", 1, true);

            dog.makeSound();
            cat.makeSound();
            mouse.makeSound();
        }
    }
