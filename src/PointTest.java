public class PointTest {
    public static void main(String[] args) {
        Point point1 = new Point();
        point1.setX(3);
        point1.setY(4);

        Point point2 = new Point();
        point2.setX(3);
        point2.setY(4);

        point2.move("x", 0);
        point2.move("y", 0);

        point2.move("x", 3);
        point2.move("y", 4);

        System.out.println("point1 : " + point1.findingDistanceToOrigin() + " orijine olan uzaklık");
        System.out.println("point2 : " + point2.findTheDistanceBetweenTwoPoints(point1) + " iki nokta arasındaki uzaklık");

        Point clone = point1.clone();
        point1.move("x", 0);
        point1.move("y", 0);
        System.out.println("point1 = clone " + "x : " + clone.getX() + " y : " + clone.getY());

        System.out.println("point1 : " + point1.findingDistanceToOrigin() + " orijine olan uzaklık");
        System.out.println("clone : " + clone.findingDistanceToOrigin() + " orijine olan uzaklık");


    }
}