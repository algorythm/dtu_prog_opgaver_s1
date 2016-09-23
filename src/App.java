/**
 * Created by awo on 23/09/16.
 */

import Uge4_Helpers.Uge4;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Programmeringsopgaver");

        System.out.println("\n============ Uge 2 ============");
        System.out.println("5: Afstand mellem linje og punkt");
        System.out.println("7: Passwordprogram (og 12A)");
        System.out.println("\n============ Uge 3 ============");

        System.out.println("11: Datoer");
        System.out.println("12: ASCII Table (12B)");
        System.out.println("13: Print en pyramide");

        System.out.println("\n============ Uge 4 ============");
        System.out.println("101: Test af Vector class");

        System.out.print("Vælg opgave: ");
        Scanner in = new Scanner(System.in);
        int opg = in.nextInt();

        switch(opg) {
            // Uge 2
            case 5:
                Uge2.opg5(); break;
            case 7:
                Uge2.opg7(); break;

            // Uge 3
            case 11:
                Uge3.opg11(); break;
            case 12:
                Uge3.opg12(); break;
            case 13:
                Uge3.opg13(); break;

            // Uge 4
            case 101:
                Uge4.test(); break;

            // Ellers
            default:
                System.exit(1);
        }
    }
}
