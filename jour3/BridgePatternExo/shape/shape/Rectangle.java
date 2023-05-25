package shape;

import draw.DrawAPI;

public class Rectangle extends Shape {

	private int largeur;
	
	private int longueur;
	
	public Rectangle(int largeur, int longueur, DrawAPI drawAPI) {
		super(drawAPI);
		this.largeur = largeur;
		this.longueur = longueur;
	}
	
	@Override
    public String draw() {
        return drawAPI.drawRectangle(largeur, longueur);
    }
	
}
