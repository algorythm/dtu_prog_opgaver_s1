package Uge5_Helpers;

import java.util.Random;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public class LicensePlate {
    private String letters;
    private String numbers;

    public LicensePlate(String _letters, String _numbers) {
        this.letters = _letters.toUpperCase();
        this.numbers = _numbers;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", letters.toUpperCase(), numbers.substring(0, 2), numbers.substring(2));
    }

    public static LicensePlate generateNewLicensePlate() {
        Random random = new Random();
        String letters = new String();
        String numbers = new String();

        for (int i = 0; i < 2; i++)
            letters += (char)(random.nextInt(26) + 'a');

        for (int i = 0; i < 5; i++)
            numbers += random.nextInt(9) + 0;

        return new LicensePlate(letters, numbers);
    }
}
