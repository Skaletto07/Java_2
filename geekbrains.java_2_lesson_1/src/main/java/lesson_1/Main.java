package lesson_1;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Barsil",5.0,40.0);
        Cat cat2 = new Cat("Ricky", 7.2, 33.3);
        Cat cat3 = new Cat("Murka", 4.4, 13.66);
        Human human1 = new Human("Maks", 0.5, 13000.0);
        Human human2 = new Human("Jon", 0.3,5000.0);
        Human human3 = new Human("Pedro", 0.15, 7000.0);
        Robot robot1 = new Robot("Robot 001", 5.0, 100000000.0);
        Robot robot2 = new Robot("Robot 002", 5.0, 100000000.0);
        Robot robot3 = new Robot("Robot 003", 5.0, 100000000.0);

        Object[] participants = {cat1,cat2,cat3,human1,human2,human3,robot1,robot2,robot3};

        Wall wall1 = new Wall(0.1);
        Wall wall2 = new Wall(0.3);
        Wall wall3 = new Wall(1.0);
        Treadmill treadmill1 = new Treadmill(10);
        Treadmill treadmill2 = new Treadmill(1000);
        Treadmill treadmill3 = new Treadmill(200000);

        Object[] obstacles = {wall1,wall2,wall3,treadmill1,treadmill2,treadmill3};


        System.out.println(human1.getJumpResult(treadmill1.getDistance()));


        for (Object o : participants) {
            for (Object o1 : obstacles) {
                if (o instanceof Cat) {
                    Cat catty = (Cat) o;
                    if (catty.isCondition()) {
                    if (o1 instanceof Wall) {
                        Wall wall = (Wall) o1;
                        System.out.println(catty.getJumpResult(wall.getHeight()));
                    } else {
                        Treadmill t = (Treadmill) o1;
                        System.out.println(catty.getRunResult(t.getDistance()));
                    }}
                } else if (o instanceof Human) {
                    Human h = (Human) o;
                    if (h.isCondition()) {
                    if (o1 instanceof Wall) {
                        Wall wall = (Wall) o1;
                        System.out.println(h.getJumpResult(wall.getHeight()));
                    } else {
                        Treadmill t = (Treadmill) o1;
                        System.out.println(h.getRunResult(t.getDistance()));
                    }}
                } else if (o instanceof Robot) {
                    Robot r = (Robot) o;
                    if (r.isCondition()) {
                    if (o1 instanceof Wall) {
                        Wall wall = (Wall) o1;
                        System.out.println(r.getJumpResult(wall.getHeight()));
                    } else {
                        Treadmill t = (Treadmill) o1;
                        System.out.println(r.getRunResult(t.getDistance()));
                    }}
                }
            }
        }



    }
}
