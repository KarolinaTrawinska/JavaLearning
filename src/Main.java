import computer.Bug;
import computer.BugReporter;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {

        System.out.println(" *LIST* ");
        List<Bug> bugs = new ArrayList<>();
        bugs.add(new Bug("Bug3", 3, new BugReporter("Karolina", "Trawińska", "karolina@email.com")));
        bugs.add(new Bug("Bug1", 3, new BugReporter("Karolina", "Trawińska", "karolina@email.com")));
        bugs.add(new Bug("Bug2", 4, new BugReporter("Mateusz", "Wiśnia", "wiśnia@email.com")));
        bugs.add(new Bug("Bug4", 4, new BugReporter("Mateusz", "Wiśnia", "wiśnia@email.com")));
        bugs.add(new Bug("Bug3", 3, new BugReporter("Karolina", "Trawińska", "karolina@email.com")));

        for (Bug bug : bugs) {
            System.out.println(bug.getBugDescription());
        }

        System.out.println(" *SET* ");
        Set<Bug> uniqueBugs = new HashSet<>(bugs);
        for (Bug bug : uniqueBugs) {
            System.out.println(bug.getBugDescription());
        }

        System.out.println(" *SORTED* ");
        Set<Bug> sortedBugs = new TreeSet<>(bugs);
        for (Bug bug : sortedBugs) {
            System.out.println(bug.getBugDescription());
        }
    }
}