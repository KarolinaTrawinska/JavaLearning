import computer.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

////        NullPointerException
//        Bug bug = new Bug("xxx", 3, new BugReporter("K", "T", "k@gmail.com"));
//        System.out.println(bug.getBugDescription());
//
//        bug = null;
//        System.out.println(bug.getBugDescription());
//
////        IndexOutOfBoundsException
//        List<String> names = new ArrayList<>();
//        names.add("Karolina");
//
//        System.out.println(names.get(1));
//
////       IllegalStateExceptionq
//        List<String> names = new ArrayList<>();
//        names.add("Karolina");
//        names.add("Mateusz");
//        names.add("Adrian");
//        names.add("Asia");
//
//        names.stream()
//                .filter(s -> s.startsWith("B"))
//                .findFirst()
//                .orElseThrow(() -> new IllegalStateException("No element"));
//
////       IllegalArgumentException
        Person user = new Person("K", "T", 3);
        user.setAge(122);
//
////       UnsupportedOperationException
//        PC Samsung = new PC("Samsung", "X", new Ram("X", 100), new Hdd("X", 110));
//        Samsung.volumeUp(111);
    }
}

