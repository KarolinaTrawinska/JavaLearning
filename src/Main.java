import computer.*;

public class Main {
    public static void main(String[] args) {
        BugReporter bugReporter = new BugReporter("Karolina", "Trawińska", "karolina@gmail.com");
        Bug bug1 = new Bug("Internet is not working", 10, bugReporter);

        System.out.println(bug1);

        bug1.setBugStatus(true);

        System.out.println(bug1);

    }
}