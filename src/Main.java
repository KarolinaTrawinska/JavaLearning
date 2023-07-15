//Methods

public class Main {
    public static void main(String[] args) {
        System.out.println(lastCharacter("Hello"));
        System.out.println(lastCharacter("It is a beautiful day"));
    }
    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }
}



//Program zwracający ostatni znak w podanym argumencie stringu