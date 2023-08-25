import computer.Laptop;
import computer.PC;

public class Main {
    public static void main(String[] args) {
        PC officeComputer = new PC("Office computer", "HP", 128);
        Laptop gamingLaptop = new Laptop("XGame", "Acer", 256);

        officeComputer.switchOn();
        gamingLaptop.switchOn();
    }
}