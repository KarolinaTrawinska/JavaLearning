
////    User input

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type your name");
        String name = getString();
        System.out.println(String.format("Hello %s", name));
        System.out.println("Type radius");

        int r = getInt();
        double area = Math.PI * r * r;

        System.out.println("Area is " + area);
    }
    private static String getString() {
        return new Scanner(System.in).next();
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

}
