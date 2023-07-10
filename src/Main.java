
//// Logical operators
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dayOftheWeek;

        System.out.println("Type number of the day of the week");
        dayOftheWeek = getInt();

        if (dayOftheWeek >= 1 && dayOftheWeek < 5) {
            System.out.println("It is working day");
        } else if (dayOftheWeek == 5) {
            System.out.println("Weekend tomorrow!");
        } else if (dayOftheWeek == 6 || dayOftheWeek == 7) {
            System.out.println("Hurra! It is weekend!");
        } else {
            System.out.println("Incorrect data");
        }
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}



//Program, który po podaniu numer dnia tygodnia określa czy jest to dzień pracujący czy weekend.