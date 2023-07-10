//If else practice

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int year;

        System.out.println("Type year");
        year = getInt();

        if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0)) {
            System.out.println("It is a leap year");
        } else {
            System.out.println("It is not a leap year");
        }
    }
    private static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}





//Program sprawdzjący czy dany rok jest rokiem przestępnym.