public class Main {
    public static void main(String[] args) {
        absolutNumber_positiveNumber_getPositive();
        absolutNumber_negativeNumber_getPositive();
    }
    public static int absolutNumber(int x ) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }
    public static void absolutNumber_positiveNumber_getPositive() {
        int result = absolutNumber(20);
        if (result != 20) {
            System.out.println("Incorrect result for positive number");
        }
    }
    public static void absolutNumber_negativeNumber_getPositive() {
        int result = absolutNumber(-10);
        if (result != 10) {
            System.out.println("Incorrect result for negative number");
        }
    }
}