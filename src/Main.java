//Methods

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type a number");
        int number = getInt();

        if (isEven(number)) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is not even");
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
    public static boolean isEven(int number) {
        return number % 2 ==0;
    }
}
