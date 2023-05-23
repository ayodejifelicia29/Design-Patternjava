package prototype;

public class Triangle implements Shape {

    private int base;

    private int dimG;

    private int dimD;

    public Triangle() {}

    public Triangle(int base, int dimG, int dimD) {
        this.base = base;
        this.dimG = dimG;
        this.dimD = dimD;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getDimG() {
        return dimG;
    }

    public void setDimG(int dimG) {
        this.dimG = dimG;
    }

    public int getDimD() {
        return dimD;
    }

    public void setDimD(int dimD) {
        this.dimD = dimD;
    }

    @Override
    public Shape clone() {
        Triangle copy = new Triangle();
        copy.setBase(this.base);
        copy.setDimG(this.dimG);
        copy.setDimD(this.dimD);

        return copy;
    }

    @Override
    public String toString() {
        return "Triangle [base=" + base + ", dimG=" + dimG + ", dimD=" + dimD + "]";
    }
}
