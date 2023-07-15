//Methods

public class Main {
    public static void main(String[] args) {
        division(10, 0);
        division(34, 12);
        division(88, 9);
    }
    public static void division(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot be divided by 0");
            return;
        }
            System.out.println("Result of division equals: " + (a / b));
        }
    }
