package Uge4_Helpers;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public enum Month {
    JANUAR(1), FEBRUAR(2), MARTS(3), APRIL(4), MAJ(5), JUNI(6), JULI(7), AUGUST(8), SEPTEMBER(9), OKTOBER(10), NOVEMBER(11), DECEMBER(12);

    private int month;

    private static Map<Integer, Month> map = new HashMap<Integer, Month>();

    static {
        for (Month monthEnum : Month.values())
            map.put(monthEnum.month, monthEnum);
    }

    Month(final int MONTH) { month = MONTH; }

    public static Month valueOf(int month) {
        return map.get(month);
    }

    @Override
    public String toString() {
        return name().substring(0,1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
