
////    Loops

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Type your room temperature");
        int roomTemperature = getInt();

        if (roomTemperature < 20) {
            System.out.println("Room temperature is low");
        } else if (roomTemperature > 20) {
            System.out.println("Room temperature is high");
        }
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}