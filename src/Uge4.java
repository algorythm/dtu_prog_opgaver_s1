/**
 * Created by awo on 23/09/16.
 */

import Uge4_Helpers.Vector;
import Uge4_Helpers.Dato;

import java.util.*;

public class Uge4
{
    public static void test() {
        Vector v1 = new Vector(1.1, 2.2);
        Vector v2 = new Vector(1.1, 2.2);
        Vector v3 = Vector.add(v1, v2);

        System.out.printf(v3.toString());
    }

    // Opgave 15: Gæt mit navn
    public static void opg15() {
        // Lav et program, hvor brugere skal gætte dit navn: Programmet skal blive ved med at bede om et navn,
        // indtil dit navn er gættet. Når der gættes forkert, skal programmet hjælpe ved at fortælle, om dit
        // navn kommer alfabetisk før eller efter det forkerte navn

        String name = "Betinna".toLowerCase();

        final int LOWER_MIN = 97;
        final int LOWER_MAX = 122;
        int correctChars = 0;

        boolean correctAns = false;

        while(!correctAns) {
            Scanner in = new Scanner(System.in);
            System.out.print("Gæt mit navn: ");

            // Read a string from the user, and split it by character
            List<Character> chars = new ArrayList<Character>(strToCharList(in.nextLine().toLowerCase()));

            if (chars.size() > name.length())
                System.out.printf("Det gættede navn er for langt");
            else {
                for (int i = 0; i < chars.size(); i++) {
                    if (chars.get(i) == name.charAt(i))
                        correctChars++;
                    else if (chars.get(i) > name.charAt(i))
                    { int readableI = i+1; System.out.println("Char på " + readableI + ". plads er forkert. Rigtig er alphabetisk før."); correctChars = 0; }
                    else if (chars.get(i) < name.charAt(i))
                    { int readabæeI = i+1; System.out.println("Char på " + readabæeI + ". plads er forkert. Rigtig er alphatisk efter."); correctChars = 0; }
                }
            }

            if (correctChars == name.length())
                correctAns = true;
        }

        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Korrekt svar: " + name);
    }

    // Opgave 17A: Dato
    public static void opg17A() {
        Dato dato = new Dato(2016, 9, 22);

        System.out.println(dato.toString());
        System.out.println(dato.dk());
        System.out.println(dato.dkText());
    }

    // Opgave 17A; Banking
    public static void opg17B() {
        // 1: Modificer klassen Transaction.java og klassen Account.java sådan at
        //    hver konto tillige indeholder oplysninger om kundens adresse.
        //         [Check]

        // 2: Tegn UML-diagram for klassen Transaction.java og klassen Account.java
        //   -   Ikke lige nu ... gider jeg ik
        //         [!Check]

        // 3: Skriv Account.java om, så den giver muligheden for at overføre fra en
        //    konto til en anden
        //         [Check]

        // 4: Skriv Transaction.java om så den viser den nye mulighed. Skriv
        //    Account.java om så den kun behøver navn og kontonummer.
        //        [Check]

        String[] args = {};
        Uge4_Helpers.Banking.Transactions.main(args);
    }

    private static List<Character> strToCharList(String string) {
        List<Character> chars = new ArrayList<Character>();

        for (int i = 0; i < string.length(); i++) {
            chars.add(string.charAt(i));
        }

        return chars;
    }
}
