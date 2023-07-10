
//// Logical operators

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type first side of the rectangle");
        int a = getInt();

        System.out.println("Type second side of the rectangle");
        int b = getInt();

        double area = a * b;
        if (a > 0 && b > 0) {
            System.out.println("Rectangle area equals " + area);
        }
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}

