/**
 * Created by awo on 23/09/16.
 */
import java.util.Scanner;
import java.io.Console;

public class Uge2 extends Opgave {
    public static void opg5()
    {
        // Afstand mellem linje og punkt
        /*
         * dist(t,P)=(|a*x0-y0+b|)/(sqrt(1+a^2)
         */
        System.out.println("\n Opgave 5");
        System.out.println("==========");

        Scanner in = new Scanner(System.in);

        double a, b;
        System.out.print("Skriv a-værdien: ");
        a = in.nextDouble();
        System.out.print("Skriv b-værdien: ");
        b = in.nextDouble();

        double x, y;
        System.out.println("\nSå skal der skrives et punkt.");
        System.out.print("Skriv x: ");
        x = in.nextDouble();
        System.out.print("Skriv y: ");
        y = in.nextDouble();

        a = Math.abs(a);
        b = Math.abs(b);
        x = Math.abs(x);
        y = Math.abs(y);

        double dist = (a * x - y + b) / (Math.sqrt(1 + Math.pow(a, 2)));

        System.out.println(dist);

        in.close();

        end();
    }

    public static void opg7()
    {
        System.out.println("\n Opgave 7");
        System.out.println("==========");

        /*
         * Passwordprogram der beder om password på en længde mellem 4 og 9
         */

        char[] pwdArr;
        String password = new String();
        Console console = System.console();

        if (console == null)
            System.exit(0);

        boolean passReq = false;

        while (!passReq)
        {
            pwdArr= console.readPassword("Skriv en kode der er længere end 6 og kortere end 9: ");
            if (pwdArr != null)
                password = new String(pwdArr);

            if (pwdArr.length < 9 && pwdArr.length > 6 && password != null)
                passReq = true;
        }

        console.printf("Password gyldig: " + new String(password) + "%n");

        end();
    }
}
