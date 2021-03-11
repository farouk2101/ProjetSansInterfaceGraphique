import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        ShellCommande shellCommande = new ShellCommande();
        boolean fin = false;
        Map map = new Map();
        Commande  commande = new Commande(map.getJoueur());
        map.afficherMap();

        while(!fin) {
            commande.inviteCommande();
            //shellCommande.execute("dir");
            map.correctionCoord();
            map.actualiserLaMap();
            map.afficherMap();
        }

    }
}
