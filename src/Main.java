import computer.Computer;
import computer.Laptop;
import computer.PC;

public class Main {
    public static void main(String[] args) {
        Computer officeComputer1 = new PC("Office computer 1", "HP", 128);
        Computer officeComputer2 = new PC("Office computer 2", "HP", 128);
        Computer officeComputer3 = new PC("Office computer 3", "HP", 128);
        Computer gamingLaptop = new Laptop("XGame", "Acer", 256, 85);
        Computer macbook = new Laptop("MB Pro", "Pro", 256, 99);

        officeComputer1.volumeUp();
        System.out.println(officeComputer1.getVolumeLevel());

        officeComputer1.volumeUp(58);
        System.out.println(officeComputer1.getVolumeLevel());

        officeComputer1.volumeUp(58);
        System.out.println(officeComputer1.getVolumeLevel());

        officeComputer1.volumeDown(10);
        System.out.println(officeComputer1.getVolumeLevel());

        officeComputer1.volumeDown(100);
        System.out.println(officeComputer1.getVolumeLevel());

    }
}