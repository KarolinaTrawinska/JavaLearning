public class Main {
    public static void main(String[] args) {
        Test pointA = new Test();
        Test pointB = new Test();

        pointA.setX(10);
        pointA.setY(22);

        pointB.setX(234);
        pointB.setY(2);

        System.out.println(pointA);
        System.out.println(pointB);
    }
}