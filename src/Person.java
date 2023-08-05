public class Person {
    private String name;
    private int age;
    private boolean isAlive;

    public Person(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }
    public String toString() {
        return "name: " + name + ", " + "age: " + age + ", is alive: " + isAlive;
    }
}