import enums.WeekDays;

public class Main {
    public static void main(String[] args) {
        System.out.println(WeekDays.ŚRODA.getName());

        if ("środa".equalsIgnoreCase(WeekDays.ŚRODA.getName())) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }
    }
}