import java.util.Scanner;

public class Commande {
    Scanner scan;
    Joueur joueur;

    public Commande(Joueur joueur){
        scan = new Scanner(System.in);
        this.joueur = joueur;
    }

    public void inviteCommande(){
        String commande;
        System.out.print("Entrez une commande : ");
        commande = scan.nextLine();
        System.out.println();
        executerOrdre(commande);
    }

    public void executerOrdre(String ordre){
        switch (ordre){
            case "z" :
                this.joueur.setCoordY(this.joueur.getCoordY()-1);
                break;
            case "q" :
                this.joueur.setCoordX(this.joueur.getCoordX()-1);
                break;
            case "s":
                this.joueur.setCoordY(this.joueur.getCoordY()+1);
                break;
            case "d" :
                this.joueur.setCoordX(this.joueur.getCoordX()+1);
                break;
        }
    }
}
