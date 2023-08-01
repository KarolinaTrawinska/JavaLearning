public class Person {
    public String name;
    public String surname;
    public int age;

    public void setName(String personName) {
        name = personName;
    }
    public void setSurname(String personSurname) {
        surname = personSurname;
    }
    public void setAge(int personAge) {
        age = personAge;
    }
    public String toString () {
        return "My name is " + name + surname + " and I'm " + age + " years old";
    }
}





