package sumarea;

public class TColorable {
    public static void main(String[] args) {
        // Создание массива геометрических объектов
        GeometricObject[] shapes = new GeometricObject[]{
                new Circle(2.0),
                new Rectangle(3.0, 4.0),
                new Square(5.0),
                new ComparableRectangle(6.0, 7.0),
                new Square(8.0)
        };

        // Обход массива объектов
        for (GeometricObject shape : shapes) {
            System.out.println("Объект: " + shape);
            System.out.println("Площадь объекта: " + shape.getArea());

            // Проверка, можно ли объект закрасить
            if (shape instanceof Colorable) {
                ((Colorable) shape).howToColor();
            }
            System.out.println("----------");
        }
    }
}
