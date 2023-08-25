package computer;

public class PC extends Computer {
    public PC(String name, String type, int ram) {
        super(name, type, ram);
    }
    public void showName() {
        System.out.println(name);
    }
}
