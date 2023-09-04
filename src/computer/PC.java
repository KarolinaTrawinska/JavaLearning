package computer;

public class PC extends Computer {
    private boolean power;

    public PC(String name, String type, Ram ram, Hdd hdd) {
        super(name, type, hdd, ram);
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
    public int volumeDown() {
        volumeLevel += 30;
        if (volumeLevel <= 0) {
            return 0;
        } else {
            return volumeLevel;
        }
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

    @Override
    public int volumeUp(int newVolumelevel) {
        throw new UnsupportedOperationException("This method is not supported");
    }

    @Override
    public int volumeDown(int newVolumelevel) {
        volumeLevel = volumeLevel - newVolumelevel;
        if (volumeLevel <= 0) {
            volumeLevel = 0;
            return volumeLevel;
        } else {
            return volumeLevel;
        }
    }
}

