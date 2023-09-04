import computer.Bug;
import computer.BugReporter;
import enums.Gender;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> users = new ArrayList<>();

        users.add(new Person("Kaa", "T", 22, Gender.FEMALE));
        users.add(new Person("Aee", "Z", 12, Gender.FEMALE));
        users.add(new Person("Vyy", "E", 22, Gender.MALE));
        users.add(new Person("Luu", "W", 22, Gender.MALE));
        users.add(new Person("Kqq", "W", 82, Gender.FEMALE));

        //       Wyświetlanie wszystkich kobiet

        List<Person> female = users.stream()
                .filter(u -> u.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList());
        for (Person user : female) {
            System.out.println(user);

//        Dodawanie imion do listy

            List<String> names = new ArrayList<>();

            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));

                String line = bufferedReader.readLine();
                while (line != null) {
                    names.add(line);
                    line = bufferedReader.readLine();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(names);

            names.stream()
                    .filter(s -> s.startsWith("x"))
                    .findFirst()
                    .orElseThrow(() -> new IllegalStateException("No element"));

//        Utworzenie własnego wyjątku

            Bug bug = new Bug("aaa", 1, new BugReporter("AEF", "AKS", "ak@gmail.com"));
            bug.setBugPriority(11);

        }
    }
}