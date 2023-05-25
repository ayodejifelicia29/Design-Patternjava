package draw;

public interface DrawAPI {
    public String drawCircle(int x, int y, int radius);
    
    public String drawSquare(int side);
    
    public String drawTriangle(int A, int B, int C);
    
    public String drawRectangle(int largeur, int longueur);
}
