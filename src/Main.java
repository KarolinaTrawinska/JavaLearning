public class Main {
    public static void main(String[] args) {
        String word = "Ala ma psa i loda";
        int occurancesA = countOccurances(word, 'a');
        System.out.println(occurancesA);

        int occurancesL = countOccurances(word, 'l');
        System.out.println(occurancesL);
    }
    public static int countOccurances(String word, char letter) {
        int occurances = 0;
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                occurances = occurances + 1;
            }
        }
        return occurances;
    }
}