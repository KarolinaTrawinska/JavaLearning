//Arreys

public class Main {
    public static void main(String[] args) {
        boolean found = false;
        int[] numbers = {-1, 23, 245, 8733, 11243};

        int luckyNumber = 23;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == luckyNumber) {
                break;
            }
        }
            if (found = true) {
                System.out.println("Lucky number was found");
            } else {
                System.out.println("There is no lucky number");
            }
        }
    }




    
//Program, który odpowiada na pytanie: czy dana liczba znajduje się w tablicy?