public class Car {
    private int speed;
    private String colour;

    public void defineSpeed (int newSpeed) {
        speed = newSpeed;
    }
    public void defineColour (String newColour) {
        colour = newColour;
    }
    public void describeCar() {
        System.out.println("This car is " + colour + "and can drive " + speed + " km/h" );
    }
}
