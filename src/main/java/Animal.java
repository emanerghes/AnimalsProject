
public class Animal {

    private String type;
    private String sound;

    public Animal(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public void makeSound() {

        System.out.println(type + " " + this.getClass().getName() + " " + "makes sound:" + sound);

    }
}
