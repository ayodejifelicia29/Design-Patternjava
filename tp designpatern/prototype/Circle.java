package prototype;

public class Circle implements Shape {

    private int rayon;

    public Circle(int rayon) {
        this.rayon = rayon;
    }

    public int getRayon() {
        return rayon;
    }

    public void setRayon(int rayon) {
        this.rayon = rayon;
    }

    @Override
    public Circle clone() {
        return new Circle(rayon);
    }

    @Override
    public String toString() {
        return "Circle [rayon=" + rayon + "]";
    }
}
