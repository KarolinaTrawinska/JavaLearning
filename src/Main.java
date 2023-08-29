public class Main {
    public static void main(String[] args) {
        Person Karolina = new Person("Karolina", "Trawińska", 28);
        Person Karolina1 = new Person("Karolina", "Trawińska", 28);

        System.out.println(Karolina.equals(Karolina1));

    }
}