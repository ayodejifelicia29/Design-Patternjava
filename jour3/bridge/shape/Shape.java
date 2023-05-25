package bridge.shape;

import bridge.draw.DrawAPI;

public abstract class Shape {

    protected DrawAPI drawAPI;

    public Shape() {}

    public Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract String draw();

}
