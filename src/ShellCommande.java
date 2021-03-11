import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Ne fonctionne pas encore
 */
public class ShellCommande {

    public ShellCommande() {

    }

    public void execute(String commande) throws IOException {
        ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", commande);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) {
                break;
            }
            System.out.println(line);
        }
    }
}
