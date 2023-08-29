package computer;

public class Laptop extends Computer implements Music, Video {
    private int batteryLevel;

    @Override
    public void playMusic() {
        System.out.println("Play music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pause music");

    }

    @Override
    public void stopMusic() {
        System.out.println("Stop music");

    }

    @Override
    public void playVideo() {
        System.out.println("Play video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("Pause video");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stop video");
    }

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
            volumeLevel = 0;
            return volumeLevel;
        } else {
            return volumeLevel;
        }
    }

    @Override
    public void switchOn() {
        System.out.println("Checking battery level");
        if (batteryLevel > 0) {
            super.switchOn();
        } else {
            System.out.println("Battery level too low");
        }
    }

    @Override
    public int volumeUp(int newVolumelevel) {
        volumeLevel = volumeLevel + newVolumelevel;
        if (volumeLevel >= 100) {
            volumeLevel = 100;
            return volumeLevel;
        } else {
            return volumeLevel;
        }
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
