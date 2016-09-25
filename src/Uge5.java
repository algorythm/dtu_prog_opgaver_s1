/**
 * Created by AndersWOlsen on 25-09-2016.
 */

import Uge5_Helpers.Point;

public class Uge5 {
    public static void opg19() {
        Point p1 = new Point(5,10);
        Point p2 = new Point(5,10);

        // --------------------- \\

        Point.printPoints(p1,p2);
        p1.move(2,2);

        Point.printPoints(p1,p2);
        p1=p2;

        Point.printPoints(p1,p2);
        p1.move(2,2);

        Point.printPoints(p1,p2);
    }
}
