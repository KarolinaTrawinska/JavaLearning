//Methods

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type a number");

        int number = getInt();

        double squareNumber = countSquare(number);

        System.out.println("Square of this number equals: " + squareNumber);
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static double countSquare(int number) {
        return number * number;
    }
}

