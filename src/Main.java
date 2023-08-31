import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> names = new HashMap<>();

        names.put(1, "Karolina");
        names.put(121, "Bartek");
        names.put(71, "Marian");
        names.put(4, "Zosia");

        Map<Integer, String> sortedNames = new TreeMap<>(names);
        System.out.println(sortedNames);
    } 
}