public class Mouse extends Animal {
    private int age;
    private boolean isWhite;

    public Mouse(String name, String sound, int age, boolean isWhite) {
        super(name, sound);
        this.age = age;
        this.isWhite = isWhite;
    }

    public Mouse() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }
}







