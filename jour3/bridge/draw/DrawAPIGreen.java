package bridge.draw;

public class DrawAPIGreen implements DrawAPI {

    @Override
    public String drawCircle(int x, int y, int radius) {
        return String.format("Je dessine un cercle de centre (%d, %d) et de rayon %d en vert", x, y,
                radius);
    }

}
