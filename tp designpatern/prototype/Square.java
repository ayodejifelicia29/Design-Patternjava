package prototype;

public class Square implements Shape {

    private int dimension;

    public Square(int dimension) {
        this.dimension = dimension;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public Square clone() {
        return new Square(dimension);
    }

    @Override
    public String toString() {
        return "Square [dimension=" + dimension + "]";
    }
}
