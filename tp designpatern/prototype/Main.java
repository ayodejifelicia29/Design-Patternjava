package prototype;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Circle copyCircle = circle.clone();

        Triangle triangle = new Triangle(10, 5, 5);
        Shape copyTriangle = triangle.clone();


        Square square = new Square(10);
        Square copySquare = square.clone();

        System.out.println(circle);
        System.out.println(copyCircle);

        System.out.println(triangle);
        System.out.println(copyTriangle);

        System.out.println(square);
        System.out.println(copySquare);
    }
}
