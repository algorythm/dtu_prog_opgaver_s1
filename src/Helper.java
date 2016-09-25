import java.io.IOException;

/**
 * Created by AndersWOlsen on 25-09-2016.
 */
public class Helper {
    public static void waitForKey() {
        try { System.in.read(); } catch (IOException ioe) {}
    }
}
