//Switch and default

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int dayOftheWeek;

        System.out.println("Type number of the day of the week");
        dayOftheWeek = getInt();

        switch (dayOftheWeek) {
            case 1:
                System.out.println("It is Monday");
                break;
            case 2:
                System.out.println("It is Tuesday");
                break;
            case 3:
                System.out.println("It is Wednesday");
                break;
            case 4:
                System.out.println("It is Thursday");
                break;
            case 5:
                System.out.println("It is Friday");
                break;
            case 6:
                System.out.println("It is Saturday");
                break;
            case 7:
                System.out.println("It is Sunday");
                break;
            default:
                System.out.println("Incorrect data");
        }
    }
    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}




//Pobranie numeru dnia tygodnia, porównanie za pomocą instrukcji switch. Jeśli żadna liczba nie pasuje do watości zmiennej
// dnia tygodnia to zostanie uruchomiona instrukacj default.

