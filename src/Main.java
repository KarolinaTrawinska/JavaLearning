
////    User input

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type your name");
        String name = getString();
        System.out.println(String.format("Hello %s", name));
        System.out.println("Type radius");

        int r = getInt();
        double area = calculateArea(r);

        System.out.println("Area is " + area);
    }
    private static String getString() {
        String name = new Scanner(System.in).next();
        return name;
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }

    private static double calculateArea (int r) {
        return Math.PI * r * r;
    }

}
