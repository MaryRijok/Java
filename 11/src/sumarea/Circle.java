package sumarea;

public class Circle extends GeometricObject {
    private double radius;

    // Конструкторы без параметров и с параметрами
    public Circle() {
        this(0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this(radius); // вызов конструктора с одним параметром
        this.setColor(color);
        this.setFilled(filled);
    }

    // Геттер для радиуса
    public double getRadius() {
        return this.radius;
    }

    // Сеттер для радиуса
    public void setRadius(double r) {
        this.radius = r;
    }

    // Переопределение метода для расчёта площади
    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    // Переопределение метода для расчёта периметра
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    // Метод для текстового представления объекта
    @Override
    public String toString() {
        return String.format("Круг: радиус = %.2f, площадь = %.2f, периметр = %.2f", 
                              this.radius, getArea(), getPerimeter());
    }
}
