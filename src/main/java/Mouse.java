// Un tip de animal -> Soarece care mosteneste atributele si metodele din clasa Animal
public class Mouse extends Animal {

    private int age;

    public Mouse(String name, String sound, int age, boolean isWhite) {
        super(name, sound);
        this.age = age;

    }

    public Mouse() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}







