import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    private Point[] points;

    public Test(Point[] points) {
        this.points = points;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Test other = (Test) o;
        return Arrays.equals(this.points,other.points);
    }


}