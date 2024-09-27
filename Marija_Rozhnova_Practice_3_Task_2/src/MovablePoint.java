public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x; this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void MoveUp() { this.x -= 1; }
    @Override
    public void MoveDown() { this.x += 1; }
    @Override
    public void MoveLeft() { this.y -= 1; }
    @Override
    public void MoveRight() { this.y += 1; }
}