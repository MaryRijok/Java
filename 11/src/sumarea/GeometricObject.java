package sumarea;

import java.util.Date;

public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean filled;
    private final Date creationDate;

    // Конструкторы
    protected GeometricObject() {
        this("белый", false);
    }

    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.creationDate = new Date();
    }

    // Геттер для цвета
    public String getColor() {
        return this.color;
    }

    // Сеттер для цвета
    public void setColor(String color) {
        this.color = color;
    }

    // Проверка заливки
    public boolean isFilled() {
        return this.filled;
    }

    // Установка заливки
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Дата создания объекта
    public Date getCreationDate() {
        return this.creationDate;
    }

    // Переопределение метода toString
    @Override
    public String toString() {
        return String.format("Создано: %s%nЦвет: %s%nЗаливка: %s", 
                              this.creationDate, this.color, this.filled);
    }

    // Абстрактные методы
    public abstract double getArea();
    public abstract double getPerimeter();

    // Сравнение по площади
    @Override
    public int compareTo(GeometricObject other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    // Статический метод для нахождения максимального объекта
    public static GeometricObject max(GeometricObject obj1, GeometricObject obj2) {
        return obj1.compareTo(obj2) >= 0 ? obj1 : obj2;
    }
}
