public class Main {
    public static void main(String[] args) {
        Test pointA = new Test(10, 33);
        Test pointB = new Test(312, 455);
        Test pointC = new Test(89, 66);

        System.out.println(pointA.equals(pointB));
        System.out.println(pointA.equals(pointC));
        System.out.println(pointA.equals(pointA));
        System.out.println(pointA.equals(null));
    }
}