package computer;

public class Computer {
    protected String name;
    protected String type;
    protected int ram;
    protected boolean state;

    public Computer(String name, String type, int ram) {
        this.name = name;
        this.type = type;
        this.ram = ram;
        this.state = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public void switchOn() {
        System.out.println("State is true");
        state = true;
    }

    public void switchOff() {
        System.out.println("Switching off: " + name);
        state = false;
    }

    public boolean getState() {
        return state;
    }

    public void showComputername() {
        System.out.println(name);
    }
}

