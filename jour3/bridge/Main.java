package bridge;

import bridge.draw.DrawAPIGreen;
import bridge.draw.DrawAPIRed;
import bridge.shape.Circle;
import bridge.shape.Shape;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 10, 5, new DrawAPIRed());
        Shape greenCircle = new Circle(20, 20, 5, new DrawAPIGreen());

        System.out.println(redCircle.draw());
        System.out.println(greenCircle.draw());
    }
}
