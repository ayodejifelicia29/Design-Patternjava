package decorator;

public abstract class ShapeDecorator implements Shape {
    protected Shape myShape;

    public ShapeDecorator(Shape myShape) {
        this.myShape = myShape;
    }

    @Override
    public void draw() {
        myShape.draw();
    }

    @Override
    public void update(String text) {
        myShape.update(text);
    }

    public abstract void nouvellFonctionnalite(); // new feature

    public abstract String getColor();
}
