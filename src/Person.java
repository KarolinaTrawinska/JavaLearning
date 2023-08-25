public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public static int userCounter = 0;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        userCounter++;
    }
    public void setFirstname (String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setAge (int age) {
        this.age = age;
    }
    public int age() {
        return age;
    }
}