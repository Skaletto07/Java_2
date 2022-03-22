package lesson_1;

public class Wall {
    private final double height;
    private ToJumpImpl toJump;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
