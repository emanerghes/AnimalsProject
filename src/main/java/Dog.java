// Un tip de animal -> Caine care mosteneste atributele si metodele din clasa Animal

public class Dog extends Animal {

    private String breed;

    public Dog(String nume, String sound, String breed) {
        super(nume, sound);
        this.breed = breed;
    }

    public Dog() {
        super();
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}