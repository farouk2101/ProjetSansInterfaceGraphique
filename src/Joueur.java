public class Joueur {
    private char aspect;
    private Coordonnee coordonnee;

    public Joueur(char aspect, Coordonnee coordonnee){
        this.aspect = aspect;
        this.coordonnee = coordonnee;
    }

    public Joueur(){}

    public void afficheJoueurPos(){
        this.coordonnee.afficherCoord();
    }

    public void setAspect(char aspect) {
        this.aspect = aspect;
    }

    public void setCoordonnee(Coordonnee coordonnee) {
        this.coordonnee = coordonnee;
    }

    public char getAspect() {
        return aspect;
    }

    public Coordonnee getCoordonnee() {
        return coordonnee;
    }

    public int getCoordX(){
        return this.getCoordonnee().getX();
    }

    public int getCoordY(){
        return this.getCoordonnee().getY();
    }

    public void setCoordX(int x){
        this.getCoordonnee().setX(x);
    }

    public void setCoordY(int y){
        this.getCoordonnee().setY(y);
    }
}
