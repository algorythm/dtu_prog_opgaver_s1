package Uge5_Helpers;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public enum Color {
    RØD, GRØN, BLÅ, GUL, HVID, SORT;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
