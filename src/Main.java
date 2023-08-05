
public class Main {
    public static void main(String[] args) {
        Book HarryPotter = new Book();
        Book Flowers = new Book();

        HarryPotter.setName("Harry Potter");
        HarryPotter.setPrice(45.99);

        Flowers.setName("Flowers");
        Flowers.setPrice(25.99);

        System.out.println(HarryPotter);
        System.out.println(Flowers);
    }
}

