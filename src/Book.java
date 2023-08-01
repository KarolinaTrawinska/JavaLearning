public class Book {
    public String title;
    public String author;
    private double price;

    public String toString() {
        return title + " written by " + author + " and the price is " + price;
    }
    public void setPrice(double newPrice) {
        price = newPrice;
    }
}
