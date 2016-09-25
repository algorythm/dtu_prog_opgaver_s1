/**
 * Created by AndersWOlsen on 25-09-2016.
 */

import Uge5_Helpers.Car;
import Uge5_Helpers.CarProducents;
import Uge5_Helpers.Color;
import Uge5_Helpers.Point;

public class Uge5 extends Opgave{
    public Uge5 () {
        Helper.waitForKey();
    }

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

        end();
    }

    public static void opg20() {
        Car newCar = new Car(CarProducents.FERRARI,    Color.RØD);
        Car myCar  = new Car(CarProducents.AUDI,       Color.SORT);
        Car hisCar = new Car(CarProducents.CITROËN,    Color.GRØN);
        Car herCar = new Car(CarProducents.VOLKSWAGEN, Color.BLÅ);

        System.out.println(newCar);
        System.out.println(myCar);
        System.out.println(hisCar);
        System.out.println(herCar);

        end();
    }
}
