//If else practice

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x, y, z;

        System.out.println("Typ first number x");
        x = getInt();

        System.out.println("Type second number y");
        y = getInt();

        System.out.println("Type third number z");
        z = getInt();

        if (x > y && x > z) {
            System.out.println("The biggest number is x");
        } else if (y > x && y > z) {
            System.out.println("The biggest number is y");
        } else if (z > x && z > y) {
            System.out.println("The biggest number is z");
        }
    }
        private static int getInt () {
            return new Scanner(System.in).nextInt();
        }
}




//Pobranie od użytkownika trzech liczb i wypisanie największej z nich.

