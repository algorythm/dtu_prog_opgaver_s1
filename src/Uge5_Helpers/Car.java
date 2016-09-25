package Uge5_Helpers;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public class Car {
    private CarProducents producent;
    private Color color;
    private LicensePlate licensePlate;

    public Car (CarProducents _producent, Color _color, LicensePlate _licensePlate) {
        this.producent    = _producent;
        this.color        = _color;
        this.licensePlate = _licensePlate;
    }

    public Car (CarProducents _producent, Color _color) {
        this.producent    = _producent;
        this.color        = _color;
        this.licensePlate = LicensePlate.generateNewLicensePlate();
    }

    @Override
    public String toString() {
        return String.format("Dette er en %s bil af mærket %s. Nummerpladen er: %s", producent, color, licensePlate);
    }
}
