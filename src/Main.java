import computer.Computer;
import computer.Hdd;
import computer.Laptop;
import computer.Ram;

public class Main {
    public static void main(String[] args) {
        Hdd hdd = new Hdd("Samsung", 500);
        Ram ram = new Ram("Sony", 128);

        Computer mac = new Laptop("Mac", "Pro", ram, hdd, 100);

        System.out.println(mac.getRam().getSize());

    }
}