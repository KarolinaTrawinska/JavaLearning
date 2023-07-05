//    Określanie i wyświetlanie zmiennych
public class Main{
    public static void main(String[] args) {
        int radius = 4;
        double pi = 3.14;
        double area = radius * radius * pi;
        double circumference = 2 * pi * radius;

        System.out.println("Pole koła równa się: " + area);
        System.out.println("Obwód koła równa się: " + circumference);
    }
}
