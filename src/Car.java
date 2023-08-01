public class Car {
    private int speed;
    private String colour;

    public void defineSpeed (int newSpeed) {
        speed = newSpeed;
    }
    public void defineColour (String newColour) {
        colour = newColour;
    }
    public String toString () {
        return "This car is " + colour + "and can drive " + speed + " km/h";
    }
}
