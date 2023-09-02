import computer.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        computers.add(new Laptop("MB Pro1", "Pro1", new Ram("HP", 128), new Hdd("HP", 500), 99));
        computers.add(new Laptop("MB Pro2", "Pro2", new Ram("HP", 128), new Hdd("HP", 500), 55));
        computers.add(new Laptop("MB Pro2", "Pro2", new Ram("HP", 128), new Hdd("Samsung", 500), 55));
        computers.add(new Laptop("MB Pro2", "Pro2", new Ram("HP", 128), new Hdd("Acer", 500), 55));
        computers.add(new Laptop("MB Pro3", "Pro3", new Ram("HP", 128), new Hdd("HP", 300), 1));
        computers.add(new PC("PC1", "A1", new Ram("HP", 128), new Hdd("HP", 500)));
        computers.add(new PC("PC2", "A2", new Ram("HP", 256), new Hdd("HP", 500)));
        computers.add(new PC("PC3", "A3", new Ram("HP", 128), new Hdd("HP", 500)));

//        Wyświetlanie wszystkich komputerów, które mają więcej niż 128gb RAM
        long countRam = computers.stream()
                .filter(computer -> computer.getRam().getSize() > 128)
                .count();
        System.out.println(countRam);

//        Wyświetlanie wszystykich typów komputerów
        computers.stream()
                .map(computer -> computer.getType())
                .forEach(System.out::println);

//        Wyświetlanie komputera który ma najwięcej RAMU
        Computer biggestRam = computers.stream()
                .max(Comparator.comparingInt(comp -> comp.getRam().getSize()))
                .orElseThrow(() -> new IllegalStateException("No elements found"));
        System.out.println(biggestRam.getName());

//        Sortowanie komputerow po nazwie i typie
        List<Computer> sortedComputers = computers.stream()
                .sorted(Comparator.comparing(Computer::getName).thenComparing(Computer::getType))
                .collect(Collectors.toList());
        for (Computer comp : sortedComputers) {
            System.out.println(comp.getName() + " " + comp.getType());
        }

//        OPTIONALS
        Optional<Computer> maxRam = computers.stream()
                .max(Comparator.comparingInt(Computer::getVolumeLevel));
                if (maxRam.isPresent()) {
                    System.out.println(maxRam.get().getName());
                } else {
                    System.out.println("No element");
                }

       String MB = computers.stream()
                .map(Computer::getName)
                .filter(s -> s.equals("MB Pro2"))
                .findFirst()
                .orElse("No element");
        System.out.println(MB);


        Computer newComputer = computers.stream()
                .filter(computer -> computer.getName().startsWith("P"))
                .findFirst()
                .orElseGet(() -> (new Laptop("PC Pro1", "Pro1", new Ram("HP", 128), new Hdd("HP", 500), 99)));
        System.out.println(newComputer.getName());


        Computer exeption = computers.stream()
                .filter(computer -> computer.getName().startsWith("X"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("Error"));
        System.out.println(exeption.getName());


        computers.stream()
                .filter(computer -> computer.getName().startsWith("M"))
                .findFirst()
                .ifPresentOrElse(computer -> System.out.println(computer.getName()),
                        () -> System.out.println("No element"));
    }
}