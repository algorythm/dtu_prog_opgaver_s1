package Uge4_Helpers;

import java.util.*;

public class Vector {
    protected double x;
    protected double y;

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public static Vector add(Vector v1, Vector v2) {
        return new Vector(v1.x + v1.y, v2.x + v2.y);
    }

    @Override
    public String toString() {
        return "(" + this.x + "),(" + this.y + ")";
    }
}
