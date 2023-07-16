//Methods

public class Main {
    public static void main(String[] args) {
        typeThis(10);
        typeThis(3.14);
        typeThis(19, 22);
        typeThis("Hello");
        typeThis(new int[]{1, 3, 5});
    }
        public static void typeThis(int number) {
            System.out.println("Lucky number is: " + number);
        }
        public static void typeThis(double x) {
            System.out.println("Pi equals: " + x);
        }
        public static void typeThis(int firstNumber, int secondNumber) {
            System.out.println("Lucky numbers are: " + firstNumber + "," + secondNumber);
        }
        public static void typeThis(String word) {
            System.out.println("First word is: " + word);
        }
        public static void typeThis(int[] table) {
            for (int i = 0; i < table.length; i++) {
                System.out.println("Element number " + i + " is: " + table[i]);
            }
        }
    }