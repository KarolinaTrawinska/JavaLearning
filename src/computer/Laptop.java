package computer;

public class Laptop extends Computer {

    private int batteryLevel;
    public Laptop(String name, String type, int ram, int batteryLevel) {
        super(name, type, ram);
        this.batteryLevel = batteryLevel;
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

