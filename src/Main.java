import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Karolina");
        names.add("Mateusz");
        names.add("Filip");
        names.add("Adrian");
        names.add("Kasia");
        names.add("Feliks");
        names.add("Franek");

        boolean anyMatch = names.stream()
                .anyMatch(str -> str.contains("a"));
        System.out.println(anyMatch);

        boolean allMatch = names.stream()
                .allMatch(str -> str.length() > 2);
        System.out.println(allMatch);

        boolean noneMatch = names.stream()
                .noneMatch(str -> str.endsWith("!"));
        System.out.println(noneMatch);

        List<String> fNames = names.stream()
                .filter(str -> str.startsWith("F"))
                .collect(Collectors.toList());
        System.out.println(fNames);

    }
}