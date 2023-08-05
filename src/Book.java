public  class Book {
    private String name;
    private double price;

    public void setPrice(double price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String toString() {
        return name + "," + price;
    }
}