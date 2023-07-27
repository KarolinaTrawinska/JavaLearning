public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.defineSpeed(60);
        car1.defineColour("red ");

        Car car2 = new Car();
        car2.defineSpeed(120);
        car2.defineColour("black ");

        car1.describeCar();
        car2.describeCar();
    }
}