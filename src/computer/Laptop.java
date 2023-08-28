package computer;

public class Laptop extends Computer {

    private int batteryLevel;
    public Laptop(String name, String type, int ram, int batteryLevel) {
        super(name, type, ram);
        this.batteryLevel = batteryLevel;
    }
    public int volumeUp() {
        return volumeLevel += 5;
    }

    @Override
    public int volumeDown() {
        volumeLevel -= 2;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if(batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low");
        }
    }
}

