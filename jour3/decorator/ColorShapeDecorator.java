package decorator;

public class ColorShapeDecorator extends ShapeDecorator {

    private String color;

    public ColorShapeDecorator(Shape myShape, String color) {
        super(myShape);
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void draw() {
        myShape.draw();
        setRedBorder();
    }

    public void setRedBorder() {
        System.out.println("added " + color + " border");
    }

    @Override
    public void nouvellFonctionnalite() {
        System.out.println("j'ai une nouveaute");
    }
}
