
public class Main {
    public static void main(String[] args) {
        Person Karolina = new Person();
        Karolina.name = "Karolina";
        Karolina.age = 28;
        Karolina.isAlive = true;

        Person Freddie = new Person();
        Freddie.name = "Freddie";
        Freddie.age = 77;
        Freddie.isAlive = false;

       Karolina.introduceYourself();
       Freddie.introduceYourself();

    }
}