//First tests

public class Main {
    public static void main(String[] args) {
        square_positiveNumber_positiveNumbersquare();
        square_negativeNumber_negativeNumbersquare();
        square_numberZero_zero();
    }
    
    public static int square(int x) {
        return x * x;
    }
    public static void square_positiveNumber_positiveNumbersquare() {
        int result = square(20);

        if (result != 400) {
            System.out.println("Icorrect result for number 20: " + result);
        }
    }
    public static void square_negativeNumber_negativeNumbersquare() {
        int result = square(-5);

        if (result != 25) {
            System.out.println("Incorrect result for number -5: " + result);
        }
    }
    public static void square_numberZero_zero() {
        int result = square(0);

        if (result != 0) {
            System.out.println("Incorrect result for number 0: " + result);
        }
    }
}
