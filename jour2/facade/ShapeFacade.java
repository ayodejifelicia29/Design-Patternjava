package facade;

public class ShapeFacade {
    private Circle circle;
    private Square square;
    private Triangle triangle;

    public ShapeFacade() {
        circle = new Circle();
        square = new Square();
        triangle = new Triangle();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }

    public void drawTriangle() {
        triangle.draw();
    }
}
