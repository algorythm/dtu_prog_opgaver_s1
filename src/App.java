/**
 * Created by awo on 23/09/16.
 */

import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        while (true) {
            // Clear the console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Programmeringsopgaver");

            System.out.println("\n============ Uge 2 ============");
            System.out.println("5 : Afstand mellem linje og punkt");
            System.out.println("7 : Passwordprogram (og 12A)");

            System.out.println("\n============ Uge 3 ============");
            System.out.println("11 : Datoer");
            System.out.println("12 : ASCII Table (12B)");
            System.out.println("13 : Print en pyramide");

            System.out.println("\n============ Uge 4 ============");
            System.out.println("101: Test af Vector class");
            System.out.println("15 : Gæt mit navn");
            System.out.println("170: Dato-klasse (17A)");
            System.out.println("171: Banking");

            System.out.println("\n============ Uge 5 ============");
            System.out.println("19: Punkter");
            System.out.println("20: Cars");

            System.out.print("\nVælg opgave: ");
            Scanner in = new Scanner(System.in);
            int opg = in.nextInt();

            // Clear the console
            System.out.print("\033[H\033[2J");
            System.out.flush();

            switch (opg) {
                case 0:
                    System.exit(0); break;

                // Uge 2
                case 5:
                    Uge2.opg5();  break;
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
                case 15:
                    Uge4.opg15(); break;
                case 170:
                    Uge4.opg17A(); break;
                case 171:
                    Uge4.opg17B(); break;

                // Uge 5
                case 19:
                    Uge5.opg19(); break;
                case 20:
                    Uge5.opg20(); break;

                // Ellers
                default:
                    System.exit(1);
            }

            in.close();
        }
    }
}
