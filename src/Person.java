import java.util.Scanner;

public class Person {
        String name;
        int age;
        boolean isAlive;

        public Person (String name, int age, boolean isAlive) {
            this.name = name;
            this.age = age;
            this.isAlive = isAlive;
        }

        public void introduceYourself() {
            System.out.println("My name is " + name + " and I'm " + age + " years old");
        }
}
