import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Ne fonctionne pas encore
 */
public class ShellCommande {

    public ShellCommande(){

    }

    public void execute(String commande){
        try{
            Process process = Runtime.getRuntime().exec(commande);
            StringBuilder output = new StringBuilder();
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            while((line = reader.readLine()) != null){
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
