//Arrays

public class Main {
    public static void main(String[] args) {
        int[] firstArray = {10, 20, 30};
        int[] secondArray = {10, 20, 30};

        if (firstArray.length != secondArray.length) {
            System.out.println("They are not the same.");
        } else {
            boolean areDifferent = false;

            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    areDifferent = true;
                    break;
                }
            }
            if (areDifferent) {
                System.out.println("They are not the same");
            } else {
                System.out.println("They are the same");
            }
        }
    }
}




//Porównanie zawartości dwóch tabel polega na skorzystaniu z pętli, przejściu przez wszystkie elementy tablic i
//porównaniu ich ze sobą.
