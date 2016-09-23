/**
 * Created by awo on 23/09/16.
 */
import java.util.Scanner;

public class Uge3 {
    // Opgave 12b
    public static void opg12() {
        System.out.println("\n Opgave 12B");
        System.out.println("==========");

        final int UPPER_MIN = 65;
        final int UPPER_MAX = 90;
        final int LOWER_MIN = 97;
        final int LOWER_MAX = 122;
        final int NUM_MIN   = 48;
        final int NUM_MAX   = 57;

        System.out.print("Indstast et tegn: ");

        Scanner in = new Scanner(System.in);

        char ch = in.next().charAt(0);
        if (charIsBetween(ch, UPPER_MIN, UPPER_MAX))
            System.out.println("Stort bogstav");

        else if (charIsBetween(ch, LOWER_MIN, LOWER_MAX))
            System.out.println("Lille bogstav");

        else if (charIsBetween(ch, NUM_MIN, NUM_MAX))
            System.out.println("Tal");

            // Tegn: #, !, \ og +, men de virker ikke :(
        else if (ch == 35 || ch == 33 || ch == 43 || ch == 92)
            System.out.println("Enten #, !, \\ eller +");

        else
            System.out.println("Intet gyldigt");

    }

    public static void opg11() {
        System.out.println("\n Opgave 11");
        System.out.println("==========");

        boolean validDate = false;
        int year = 0, month, day;

        while (!validDate)
        {
            Scanner in = new Scanner(System.in);

            while (intIsBetween(year, 2000, 2999)) {
                System.out.print("Indtast år: ");
                year = in.nextInt();
            }

            System.out.print("Indtast måned: ");
            month = in.nextInt();

            System.out.println("Indtast dag: ");
            day = in.nextInt();

            in.close();
        }
    }

    public static void opg13() {
        // Lav et program der laver pyramider:
        //     *
        //    ***
        //   *****

        int spaces = 0;
        int stars  = 1;
        int layers = 8;

        Scanner in = new Scanner(System.in);

        System.out.print("Skriv et tal mellem 1 og 15: ");

        try {
            layers = in.nextInt();
        } catch (Exception ex) {
            System.out.println("Skal være et tal");
        }

        if (!intIsBetween(layers, 1, 15)) {
            System.out.println("Der skal være mellem 1 og 15 lag.");
            return;
        }

        spaces = layers - 1;

        for (int currentLayer = layers; currentLayer > 0; currentLayer--) {
            //System.out.println(spaces);
            for (int i = spaces; i > 0; i--) {
                System.out.print(" ");
            }
            for (int i = stars; i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
            spaces--;
            stars += 2;
        }
    }

    private static boolean charIsBetween(char value, int min, int max) {
        if (value <= max && value >= min)
            return true;
        else
            return false;
    }

    private static boolean intIsBetween(int value, int min, int max) {
        if (value <= max && value >= min)
            return true;
        else
            return false;
    }
}
