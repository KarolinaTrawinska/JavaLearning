
////    Loops and data validation

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Type the radius");
        int number = getInt();

        while (number < 0) {
            System.out.println("You typed incorrect value, please type number that is bigger than 0 ");
            number = getInt();}

            double area = Math.PI * number * number;
            System.out.println("You typed correct number. Area equals " + area);
        }

    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }
}


//Program polega na pobraniu od użytkownika licznby, która ma być wartością promienia koła. Następnie sprawdza czy jest to wartość poprawna - większa od zera.
//Potem wyświetla pole koła.