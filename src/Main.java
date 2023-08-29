import computer.Computer;
import computer.Laptop;
import computer.PC;

public class Main {
    public static void main(String[] args) {
        Laptop gamingLaptop = new Laptop("XGame", "Acer", 256, 85);
        Laptop macbook = new Laptop("MB Pro", "Pro", 256, 99);

        gamingLaptop.sayHello();

    }
}