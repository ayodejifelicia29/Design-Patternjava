package decorator;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redBorderedCircle = new ColorShapeDecorator(circle, "red");
        redBorderedCircle.draw();
        redBorderedCircle.update("je me suis fait updated");

        ShapeDecorator colorBorderedRectangle = new ColorShapeDecorator(rectangle, "blue");
        colorBorderedRectangle.draw();
        System.out.println(colorBorderedRectangle.getColor());
        colorBorderedRectangle.update("je me suis fait updated");
        colorBorderedRectangle.nouvellFonctionnalite();
    }
}
