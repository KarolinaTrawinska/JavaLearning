import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        System.out.println(" * USERS * ");
        for (Person user : users) {
            System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getAge());
        }

        System.out.println(" * SORTED USERS * ");
        List<Person> sortedUsers = users.stream()
                .sorted(Comparator.comparing(user -> user.getFirstName()))
                .collect(Collectors.toList());
        for (Person user : sortedUsers) {
            System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getAge());
        }

        System.out.println(" *  USERS SORTED BY FIRST AND LAST NAME * ");
        List<Person> extraSortedusers = users.stream()
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName))
                .collect(Collectors.toList());
        for (Person user : extraSortedusers) {
            System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getAge());
        }

        System.out.println(" *  USERS SORTED BY AGE, FIRST AND LAST NAME * ");
        List<Person> sortedByage = users.stream()
                .sorted(Comparator.comparing(Person::getFirstName).thenComparing(Person::getLastName).thenComparing(Person::getAge))
                .collect(Collectors.toList());
        for (Person user : sortedByage) {
            System.out.println(user.getFirstName() + ", " + user.getLastName() + ", " + user.getAge());
        }
    }
}
