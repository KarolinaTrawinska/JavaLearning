package computer;

public class PC extends Computer {
    private boolean power;

    public PC(String name, String type, int ram) {
        super(name, type, ram);
        power = false;
    }

    public void setPower(boolean power) {
        this.power = power;
    }

    public void showName() {
        System.out.println(name);
    }
    public int volumeUp() {
        return volumeLevel += 1;
    }

    @Override
    public void switchOn() {
        System.out.println("Checking power supply");
        if (power) {
            super.switchOn();
        } else {
            System.out.println("No power");
        }
    }
}

