package draw;

public class DrawAPIPurple implements DrawAPI{

	final private String COULEUR = "lilas";
	
    @Override
    public String drawCircle(int x, int y, int radius) {
        return String.format("Je dessine un cercle de centre (%d, %d) et de rayon %d en %s", x, y, radius, COULEUR);
    }

    @Override
    public String drawSquare(int side) {
        return String.format("Je dessine un carré de côté %d en %s", side, COULEUR);
    }
    @Override
    public String drawTriangle(int A, int B, int C) {
        return String.format("Je dessine un triangle de côtés ( A=%d, B=%d, C=%d)en %s",A , B, C, COULEUR);
    }
    @Override
    public String drawRectangle(int largeur, int longueur) {
        return String.format("Je dessine un rectangle de largeur=%d et de longueur=%d, en %s", largeur, longueur, COULEUR);
    }
}
