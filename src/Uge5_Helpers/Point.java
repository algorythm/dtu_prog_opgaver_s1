package Uge5_Helpers;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public class Point {
    private int    x;
    private int    y;
    public Point(int _x, int _y) {
        this.x = _x;
        this.y = _y;
    }

    @Override
    public String toString() {
        return String.format("(%s; %s)", x, y);
    }

    public boolean equals (Point point) {
        return (this == point) ? true : false;
    }

    public void move (int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public static void printPoints(Point pt1, Point pt2){
        System.out.println("Point 1's position is " + pt1);
        System.out.println("Point 2's position is " + pt2);
        System.out.println("Point1 == Point2: " + (pt1==pt2));
        System.out.println("Point1.equals(Point2): " + pt1.equals(pt2) + "\n");
    }
}
