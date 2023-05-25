package decorator;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Je dessine un rectangle");
    }

    @Override
    public void update(String text) {
        System.out.println("rect dit ceci: " + text);
    }
}
