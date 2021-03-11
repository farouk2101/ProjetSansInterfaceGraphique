import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        boolean fin = false;
        Map map = new Map();
        Commande  commande = new Commande(map.getJoueur());
        map.afficherMap();

        while(!fin) {
            commande.inviteCommande();
            map.correctionCoord();
            map.actualiserLaMap();
            map.afficherMap();
        }

    }
}
