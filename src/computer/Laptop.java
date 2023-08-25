package computer;

public class Laptop extends Computer {
    public Laptop(String name, String type, int ram) {
        super(name, type, ram);
    }
    public void showName() {
        System.out.println(name);
    }
}
