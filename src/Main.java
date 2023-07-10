//If else practice

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age;
        boolean isOfage;
        isOfage = true;

        System.out.println("Type your age");
        age = getInt();
        if (age >= 18) {
            System.out.println("Are you of age? " + isOfage);
        } else {
            System.out.println("You are underage");
        }
    }
    public static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
