package Uge5_Helpers;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public enum CarProducents {
    CITROËN, VOLKSWAGEN, OPEL, FERRARI, AUDI;

    @Override
    public String toString() {
        return name().substring(0, 1).toUpperCase() + name().substring(1).toLowerCase();
    }
}
