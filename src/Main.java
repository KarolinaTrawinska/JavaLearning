//    Wyświetlanie daty
public class Main{
    public static void main(String[] args) {
        int day = 5;
        String month = "July";
        int year = 2023;

        System.out.println("Today's date is " + day + " " + month + " " + year);
        System.out.println(String.format("Today's date is %d %s %d and pi=%f", day, month, year, Math.PI));
    }
}
