
//// Boolean

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        boolean isEven;

        System.out.println("Type a number");
        number = getInt();

        if (number % 2 == 0) {
            isEven = true;
            System.out.println("The number is even");
        } else {
            isEven = false;
            System.out.println("The number is odd");
        }
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
