public class Map {

    private String map;
    private int longeur;
    private int largeur;
    private Joueur joueur;

    public Map(int longueur, int largeur){
        this.longeur = longueur;
        this.largeur = largeur;
        joueur = new Joueur('F', new Coordonnee(0,0));
        correctionCoord();
        map = creationMap();
    }

    public Map(){
        this.longeur = 20;
        this.largeur = 150;
        joueur = new Joueur('F', new Coordonnee(1,1));
        correctionCoord();
        map = creationMap();
    }

    public String creationMap(){
        joueur.afficheJoueurPos();
        String map = "";

        for(int i=0; i<longeur; i++){
            for(int j=0; j<largeur; j++){
                if(((i==0)||(i==longeur-1))||((j==0)||(j==largeur-1))){
                    map = map + "*";
                }
                else{
                    if((joueur.getCoordX()==j)&&(joueur.getCoordY() == i)){
                        map = map + joueur.getAspect();
                    }
                    else{
                        map = map + " ";
                    }
                }
            }
            map = map + "\n";
        }

        return map;
    }

    public void actualiserLaMap(){
        this.map = creationMap();
    }

    public void correctionCoord(){
        if(joueur.getCoordX()<1){
            joueur.setCoordX(1);
        }
        else if(joueur.getCoordX()>=largeur){
            joueur.setCoordX(largeur-1);
        }

        if (joueur.getCoordonnee().getY()<1){
            joueur.setCoordY(1);
        }
        else if(joueur.getCoordY()>=longeur-1){
            joueur.setCoordY(longeur-2);
        }
    }

    public void afficherMap(){
        System.out.println(this.map);
    }

    public String getMap() {
        return map;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getLongeur() {
        return longeur;
    }

    public void setLargeur(int largeur) {
        this.largeur = largeur;
    }

    public void setLongeur(int longeur) {
        this.longeur = longeur;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }
}
