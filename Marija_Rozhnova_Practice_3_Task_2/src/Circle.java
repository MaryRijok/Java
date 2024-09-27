public class Circle extends MovablePoint {
    double radius;

    public Circle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
}