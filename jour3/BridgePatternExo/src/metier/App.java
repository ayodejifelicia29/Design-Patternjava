package metier;

import java.util.ArrayList;
import java.util.List;

import draw.DrawAPI;
import draw.DrawAPIGreen;
import draw.DrawAPIPurple;
import draw.DrawAPIRed;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;
import shape.Triangle;

public class App {
    public static void main(String[] args) {
    	DrawAPI rouge = new DrawAPIRed();
    	DrawAPI vert = new DrawAPIGreen();
    	DrawAPI violet = new DrawAPIPurple();
    	
    	List<Shape> shapes = new ArrayList<Shape>();
    	
        shapes.add(new Circle(10, 10, 5, rouge));
        shapes.add(new Circle(20, 20, 5, vert));
        shapes.add(new Square(77, violet));
        shapes.add(new Rectangle(25, 33, violet));
        shapes.add(new Triangle(3, 4, 5, rouge));
        shapes.add(new Triangle(4,5,6, violet));
        
        for (Shape shape : shapes) {
        	System.out.println(shape.draw());
        }
    }
}
