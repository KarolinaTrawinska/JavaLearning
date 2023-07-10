//If else practice

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String name;

        System.out.println("Type your name");
        name = getString();

        if (name.equals("Karolina")) {
            System.out.println("We have the same name");
        } else {
            System.out.println("We have different name");
        }
    }
    private static String getString() {
        return new Scanner(System.in).next();
    }
}

