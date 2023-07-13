//Arrays

public class Main {
    public static void main(String[] args) {
        String[] first = {"I", "like", "music"};
        String[] second = {"I", "like", "music"};

        boolean differenceFound = false;

        if (first.length != second.length) {
            differenceFound = true;
        } else {
            for (int i = 0; i < first.length; i++) {
                if (!first[i].equals(second[i])) {
                    differenceFound = true;
                    break;
                }
            }
        }

        if (differenceFound) {
            System.out.println("They are different");
        } else {
            System.out.println("They are the same");
        }
    }
}







//    Porównanie tablic