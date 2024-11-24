package sumarea;

public class Square extends GeometricObject implements Colorable {
    private double length;

    // Конструкторы
    public Square() {
        this(1.0);
    }

    public Square(double length) {
        this.length = length;
    }

    // Геттер для стороны квадрата
    public double getLength() {
        return this.length;
    }

    // Сеттер для стороны квадрата
    public void setLength(double length) {
        this.length = length;
    }

    // Вычисление площади
    @Override
    public double getArea() {
        return Math.pow(this.length, 2);
    }

    // Вычисление периметра
    @Override
    public double getPerimeter() {
        return 4 * this.length;
    }

    // Инструкция по раскрашиванию
    @Override
    public void howToColor() {
        System.out.println("Закрасьте каждую из четырех сторон");
    }

    // Текстовое представление объекта
    @Override
    public String toString() {
        return String.format("Квадрат: сторона = %.2f, площадь = %.2f, периметр = %.2f", 
                              this.length, getArea(), getPerimeter());
    }
}
