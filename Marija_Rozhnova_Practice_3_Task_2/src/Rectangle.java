public class Rectangle {
    MovablePoint topLeft, bottomRight;

    public Rectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public boolean CheckSpeed() {
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public void MoveUp() {
        topLeft.MoveUp(); bottomRight.MoveUp();
    }
    public void MoveDown() {
        topLeft.MoveDown(); bottomRight.MoveDown();
    }
    public void MoveLeft() {
        topLeft.MoveLeft(); bottomRight.MoveLeft();
    }
    public void MoveRight() {
        topLeft.MoveRight(); bottomRight.MoveRight();
    }

    public String toStr() {
        return "x1 "+topLeft.x+" y1 "+topLeft.y+" x2 "+bottomRight.x+" y2 "+bottomRight.y;
    }
}
