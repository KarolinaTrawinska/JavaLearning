//Arrays

public class Main {
    public static void main(String args[]) {
        int [] numbers = {1, 34, 93, -39, 129, 932, 1039, 44864, 2, -77};

        int theBiggestnumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > theBiggestnumber) {
                theBiggestnumber = numbers[i];
            }
        }
        System.out.println("The biggest number is: " + theBiggestnumber);
    }
}







//    Program wypisujący największą liczbę z tablicy