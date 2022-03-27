package lesson_1;

public class Robot implements ToRun, ToJump {
    private final String name;
    private final double maxToJump;
    private final double maxDist;
    private boolean condition = true;

    public Robot(String name, double maxToJump, double maxDist) {
        this.name = name;
        this.maxToJump = maxToJump;
        this.maxDist = maxDist;
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгает!");
    }

    @Override
    public void run() {
        System.out.println(name + " бежит!");
    }
    public String getRunResult(double dist) {
        if (maxDist > dist) {
            run();
            return "Проходит дальше";
        }
        run();
        condition = false;
        return "Не смог преодолеть дистанцию и сходит";
    }
    public String getJumpResult(double height) {
        if (maxToJump > height) {
            jump();
            return "Проходит дальше";
        }
        jump();
        condition = false;
        return "Не смог преодолеть препятствие и сходит с дистанции";
    }

    public boolean isCondition() {
        return condition;
    }
}
