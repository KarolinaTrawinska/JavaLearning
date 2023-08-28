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

        Computer[] computers = { officeComputer1, officeComputer2, officeComputer3, gamingLaptop, macbook };
        for (Computer computer : computers) {
            computer.switchOff();
        }
    }
}