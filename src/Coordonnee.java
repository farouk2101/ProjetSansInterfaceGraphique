public class Coordonnee {
    int x;
    int y;

    public Coordonnee(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void afficherCoord(){
        System.out.println("Coordonnée : ("+this.x+ ","+this.y+")");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
