// Un tip de animal -> Pisica care mosteneste atributele si metodele din clasa Animal

public class Cat extends Animal {

    private String coatColor;

    public Cat(String name, String sound, String coatColor) {
        super(name, sound);
        this.coatColor = coatColor;
    }

    public Cat() {

    }

    public String getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(String coatColor) {
        this.coatColor = coatColor;
    }
}