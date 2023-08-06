public class Test {
    private int x;
    private int y;

    public Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        Test other = (Test) o;
        return this.x == other.x && this.y == other.y;
    }
}