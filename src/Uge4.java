/**
 * Created by awo on 23/09/16.
 */
package Uge4_Helpers;

public class Uge4 {
    public static void test() {
        Vector v1 = new Vector(1.1, 2.2);
        Vector v2 = new Vector(1.1, 2.2);
        Vector v3 = Vector.add(v1, v2);

        System.out.printf(v3.toString());
    }
}
