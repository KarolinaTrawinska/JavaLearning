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
        assertEquals(400, result);
        }

    public static void square_negativeNumber_negativeNumbersquare() {
        int result = square(-5);
        assertEquals(25, result);
        }

    public static void square_numberZero_zero(){
        int result = square(0);
        assertEquals(0, result);
        }

   public static void assertEquals(int expected, int actual) {
        if (expected != actual) {
        System.out.println("Expected result is different than the actual result. Expected: " + expected + " , actual: " + actual);
            }
        }
    }