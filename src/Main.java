//First tests

public class Main {
    public static void main(String[] args) {
        isEven_evenPositivenumber_even();
        isEven_evenNegativenumber_even();
        isEven_notEvenpositiveNumber_even();
        isEven_notEvennegativeNumber_even();
        isEven_zero_even();
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void isEven_evenPositivenumber_even() {
        assertEquals(true, isEven(10));
    }

    public static void isEven_evenNegativenumber_even() {
        assertEquals(true, isEven(-10));
    }

    public static void isEven_notEvenpositiveNumber_even() {
        assertEquals(false, isEven(13));
    }

    public static void isEven_notEvennegativeNumber_even() {
        assertEquals(false, isEven(-27));
    }

    public static void isEven_zero_even() {
        assertEquals(true, isEven(0));
    }

    public static void assertEquals (boolean expected, boolean actual) {
        if (expected != actual) {
            System.out.println("Expected result: " + expected + " , actual result: " + actual);
        }
    }
}





//Czy liczba jest parzysta?