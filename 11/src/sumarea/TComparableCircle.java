package sumarea;

public class TComparableCircle {
    public static void main(String[] args) {
        // Создание сравнимых кругов
        ComparableCircle firstComparableCircle = new ComparableCircle(5.0);
        ComparableCircle secondComparableCircle = new ComparableCircle(7.0);

        // Нахождение большего круга
        GeometricObject largestCircle = GeometricObject.max(firstComparableCircle, secondComparableCircle);
        System.out.println("Самый большой круг (ComparableCircle): " + largestCircle);

        // Создание объектов разного типа
        ComparableCircle sampleCircle = new ComparableCircle(6.0);
        Rectangle sampleRectangle = new Rectangle(4.0, 5.0);

        // Нахождение большего объекта
        GeometricObject largestShape = GeometricObject.max(sampleCircle, sampleRectangle);
        System.out.println("Самый большой объект между кругом и прямоугольником: " + largestShape);
    }
}
