package sumarea;

public class TGeometricObject {
    public static void main(String[] args) {
        Circle firstCircle = new Circle(5.0);
        Circle secondCircle = new Circle(7.0);

        GeometricObject biggerCircle = GeometricObject.max(firstCircle, secondCircle);
        System.out.println("Самый большой круг: " + biggerCircle);

        Rectangle firstRectangle = new Rectangle(4.0, 5.0);
        Rectangle secondRectangle = new Rectangle(3.0, 8.0);

        GeometricObject biggerRectangle = GeometricObject.max(firstRectangle, secondRectangle);
        System.out.println("Самый большой прямоугольник: " + biggerRectangle);
    }
}
