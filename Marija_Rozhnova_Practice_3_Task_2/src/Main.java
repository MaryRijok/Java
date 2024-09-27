import java.math.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10, 20, 20, 1, 2);
        rectangle.MoveDown();
        System.out.println(rectangle.CheckSpeed());
        System.out.println(rectangle.toStr());
    }
}

