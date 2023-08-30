import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> users = new ArrayList<>();

        users.add(new Person("Karolina", "Trawińska", 28));
        users.add(new Person("Mateusz", "Wiśniewski", 28));
        users.add(new Person("Aneta", "Trawińska", 51));
        users.add(new Person("Marian", "Blabla", 55));

        for (Person Person : users) {
            System.out.println(Person.getFirstName());
        }

//        Sortowanie po danym parametrze wymaga użycia comparatora i referencji do metody
        Collections.sort(users, Comparator.comparing(Person::getFirstName));
        System.out.println(users);

        Collections.sort(users, Comparator.comparingInt(Person::getAge));
        for (Person Person : users) {
            System.out.println(Person.getFirstName() + " " + Person.getAge());
        }

        Collections.sort(users, Comparator.comparingInt(Person::getAge).reversed());
        for (Person Person : users) {
            System.out.println(Person.getFirstName() + " " + Person.getAge());
        }
    }
}