
////    User input2

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        int trianglePerimeter;

        System.out.println("Type side a of the traingle");
        a = getInt();
        System.out.println("Type side b of the traingle");
        b = getInt();
        System.out.println("Type side c of the traingle");
        c = getInt();

        trianglePerimeter = a + b + c;
        System.out.println("Triangle perimeter is " + trianglePerimeter);
    }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}
