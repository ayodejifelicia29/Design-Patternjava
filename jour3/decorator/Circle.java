package decorator;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("je dessine un cercle");
    }

    @Override
    public void update(String text) {
        System.out.println("circle dit ceci: " + text);
    }

}
