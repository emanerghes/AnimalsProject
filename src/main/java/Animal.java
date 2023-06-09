// Clasa de baza Animal din care sunt derivate si restul animalelor

public class Animal {

    private String type;
    private String sound;

    public Animal(String type, String sound) {
        this.type = type;
        this.sound = sound;
    }

    public Animal() {

    }

    public String getType() {
        return type;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {

        System.out.println(type + " " + this.getClass().getName() + " " + "makes sound:" + sound);
    }
}
