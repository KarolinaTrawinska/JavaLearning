package computer;

public abstract class Computer {
    protected String name;
    protected String type;
    protected Ram ram;
    protected Hdd hdd;
    protected boolean state;
    protected int volumeLevel;

    public Computer(String name, String type, Hdd hdd, Ram ram) {
        this.name = name;
        this.type = type;
        this.hdd = hdd;
        this.ram = ram;
        this.state = false;
        this.volumeLevel = 0;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
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

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Hdd getHdd() {
        return hdd;
    }

    public void setHdd(Hdd hdd) {
        this.hdd = hdd;
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

    public abstract int volumeUp();

    public abstract int volumeDown();

    public abstract int volumeUp(int newVolumelevel);

    public abstract int volumeDown(int newVolumelevel);

}

