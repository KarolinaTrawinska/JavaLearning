public class Test {
    private String town;
    private String street;
    private int number;

    public Test (String town, String street, int number) {
        this.town = town;
        this.street = street;
        this.number = number;
    }
    public String toString() {
        return "Address is: " + town + ", " + street + ", " + number;
    }
}