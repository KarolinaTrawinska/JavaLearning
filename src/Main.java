import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Karolina");
        names.add("Mateusz");
        names.add("Asia");
        names.add("Aneta");
        names.add("Robert");
        names.add("Karolina");

        for (String name : names) {
            System.out.println(name);
        }

        Set<String> sortedNames = new TreeSet<>(names);
        System.out.println(names);





    }
}