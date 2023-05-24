// Clasa de baza Animal din care sunt derivate si restul animalelor
public class Animal {

    private String nume;
    private String sound;

    public Animal(String nume, String sound) {
        this.nume = nume;
        this.sound = sound;
    }

    public Animal() {

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println(nume + " face sunetul: " + sound);
    }
}
