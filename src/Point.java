public class Point {
    private int x;
    private int y;
    static int counter;

    {
        x = 0;
        y = 0;
    }

    static {
        counter = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        counter++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    double findingDistanceToOrigin() {
        return Math.sqrt((x * x) + (y * y));
    }

    double findTheDistanceBetweenTwoPoints(Point point) {
        return Math.sqrt(((Math.abs(this.x - point.x) * Math.abs(this.x - point.x)) + (Math.abs(this.y - point.y) * Math.abs(this.y - point.y))));
    }

    void move(String yon, int move) {
        if (yon == "x" || yon == "X") {
            this.x = move;
        } else if (yon == "y" || yon == "Y") {
            this.y = move;
        } else {
            System.out.println("Error");
        }
    }

    public Point clone() {
        Point newPoint = new Point(this.x, this.y);
        return newPoint;
    }

}
