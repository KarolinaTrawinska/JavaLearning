//Continue

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int radius;

        do {
            System.out.println("Type radius");
            radius = getInt();

            if (radius <= 0) {
                System.out.println("Incorrect data, type number bigger than 0");
                continue;
            }
            System.out.println("Area equals" + Math.PI * radius * radius);
        } while (radius <= 0);
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}