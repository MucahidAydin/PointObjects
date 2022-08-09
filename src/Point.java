public class Point {
    private int x;
    private int y;

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
        Point newPoint = new Point();
        newPoint.x = this.x;
        newPoint.y = this.y;
        return newPoint;
    }

}
