
public class Cat extends Animal {


    @Override
    public void makeSound() {
        System.out.println(this.getClass().getName() + " " + "makes sound meow");
    }

}