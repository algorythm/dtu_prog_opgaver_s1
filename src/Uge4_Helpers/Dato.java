package Uge4_Helpers;

import java.text.NumberFormat;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */

public class Dato {
    private int year;
    private int month;
    private int day;

    private NumberFormat nf = NumberFormat.getNumberInstance();

    public Dato(int _year, int _month, int _day) {
        this.year   = _year;
        this.month  = _month;
        this.day    = _day;

        nf.setMinimumIntegerDigits(2);
    }

    public String iso() {
        return String.format("%s-%s-%s", year, nf.format(month), nf.format(day));
    }

    public String dk() {
        return String.format("%s/%s %s", day, month, year);
    }

    public String dkText() {
        return String.format("%s. %s %s", day, Month.valueOf(month), year);
    }

    @Override
    public String toString() {
        return iso();
    }
}


