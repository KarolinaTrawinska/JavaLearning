
//// Logical operators
<<<<<<< Updated upstream
=======
<<<<<<< HEAD
=======

//Program który liczy pole prostokąta jeśli użytkownik poda dwa boki ale tylko gdy są większe od zera

>>>>>>> parent of c64805c (Conditional operators)
>>>>>>> Stashed changes
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        System.out.println("Type first side of the rectangle");
        a = getInt();

        System.out.println("Type second side of the rectangle");
        b = getInt();

        if (a > 0 && b > 0) {
            System.out.println("Rectangle area equals " + a * b);
        } else {
            System.out.println("Incorrect data");
        }
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}


<<<<<<< Updated upstream

//Program, który po podaniu numer dnia tygodnia określa czy jest to dzień pracujący czy weekend.
=======
<<<<<<< HEAD

//Program, który po podaniu numer dnia tygodnia określa czy jest to dzień pracujący czy weekend.
=======
>>>>>>> parent of c64805c (Conditional operators)
>>>>>>> Stashed changes
