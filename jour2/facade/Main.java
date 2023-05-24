package facade;

public class Main {

    public static void main(String[] args) {

        ShapeFacade facade = new ShapeFacade();

        facade.drawSquare();
        facade.drawCircle();
        facade.drawTriangle();
    }
}
