import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Person> users = new ArrayList<>();
        users.add(new Person("Karolina", "Trawinska", 28));
        users.add(new Person("Mateusz", "Wateusz", 68));
        users.add(new Person("Kazimiera", "Woźnica", 75));
        users.add(new Person("Adrian", "Paździoch", 15));
        users.add(new Person("Anna", "Czarny", 75));
        users.add(new Person("Anna", "Czarny", 33));
        users.add(new Person("Anna", "Zielony", 55));

//        Wyświetlanie elementu z najwyższym zadanym parametrem
        Optional<Person> max = users.stream()
                .max(Comparator.comparingInt(Person::getAge));
        if (max.isPresent()) {
            System.out.println(max.get());
        } else {
            System.out.println("no element");
        }

//        Wyświetlanie pierwszego wyfiltrowanego elementu
        String anna = users.stream()
                .map(Person::getFirstName)
                .filter(s -> s.equals("Anna"))
                .findFirst()
                .orElse("no element");
        System.out.println(anna);

//        Zwracanie nowej wartości w przypadku gdy lista nie zawiera wartości której szukamy
        Person bartek = users.stream()
                .filter(user -> user.getFirstName().startsWith("B"))
                .findFirst()
                .orElseGet(() -> new Person("Bartek", "Testowy", 22));
        System.out.println(bartek);

//            Wyjątek
        users.stream()
                .filter(user -> user.getFirstName().startsWith("L"))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException("no element"));

//        Wyświetlanie rządanego elementu
        users.stream()
                .filter(user -> user.getFirstName().startsWith("A"))
                .findFirst()
                .ifPresent(user -> System.out.println(user));

//        Wyświetlanie rządanego elementu a jak go nie ma to wyświetlanie teksu
        users.stream()
                .filter(user -> user.getFirstName().startsWith("Z"))
                .findFirst()
                .ifPresentOrElse(user -> System.out.println(user), () -> System.out.println("no element"));
    }
}
