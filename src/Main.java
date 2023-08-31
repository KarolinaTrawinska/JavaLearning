import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Person> users = new HashSet<>();
        users.add(new Person("Karolina", "Trawinska", 28));
        users.add(new Person("Karolina", "Trawinska", 28));
        users.add(new Person("Tomek", "Burak", 12));
        users.add(new Person("Marian", "Kowalski   ", 87));
        users.add(new Person("Janusz", "Mak", 56));
//
//        for (Person user : users) {
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//        }

//        Porównanie imion i nazwisk użytkowników, klasa Person dostarcza mechanizmu, dzięki temu możliwe jest zwracanie
//        unikalnych posortowanych elementów

        Set<Person> sortedPerson = new TreeSet<>(users);
        for (Person user : sortedPerson) {
            System.out.println(user.getFirstName() + " " + user.getLastName());
        }
    }
}