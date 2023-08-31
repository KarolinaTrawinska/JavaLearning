import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Karolina");
        names.add("Mateusz");
        names.add("Adrian");
        names.add("Kasia");
        names.add("Feliks");
        names.add("Franek");

        names.stream()
                .filter(str -> str.startsWith("F"))
                .filter(str -> str.contains("k"))
                .filter(str -> str.endsWith("s"))
                .forEach(str -> System.out.println(str));
        }
    }
