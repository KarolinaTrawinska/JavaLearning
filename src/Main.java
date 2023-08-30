import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        List<String> names1 = new ArrayList<>();

        names.add("Karolina");
        names.add("Mateusz");
        names.add("Bartek");
        names.add("Aneta");
        names.add("Marian");

        names1.add("Asia");
        names1.add("Adrian");

        System.out.println(names);

//        Usuwanie elementu po numerze indeksu
        names.remove(0);
        System.out.println(names);

//        Usuwanie elementu po nazwie obiektu który chcemy usunąć
        names.remove("Bartek");
        System.out.println(names);

//        Pobieranie i wyświetlanie konkretnego elementu
        String name = names.get(0);
        System.out.println(name);

//        Sprawdzanie długości listy
        System.out.println(names.size());

//        Sprawdzanie czy tablica zawiera dany element, zwraca true/false
        System.out.println(names.contains("Marian"));

//        Sprawdzanie czy tablica jest pusta, zwraca true lub false
        System.out.println(names.isEmpty());

//        Dodawanie zawartości jeden tablicy do drugiej
        names.addAll(names1);
        System.out.println(names);

//        Sortowanie elementów alfabetycznie
        Collections.sort(names);
        System.out.println(names);

//        Sortowanie elementów odwrotnie
        Collections.reverse(names);
        System.out.println(names);

    }
}