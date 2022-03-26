package competition;

import competition.barriers.Barrier;
import competition.barriers.Treadmill;
import competition.barriers.Wall;
import competition.competitors.Cat;
import competition.competitors.Competitor;
import competition.competitors.Human;
import competition.competitors.Robot;

public class Main {
    public static void main(String[] args) {
        Competitor[] competitors = {new Human("Denis", 500, 1),
                new Cat("Barsik", 200, 0.5),
                new Robot("Pathfinder", 1000, 1.5)};
        Barrier[] barriers = {new Wall(1), new Treadmill(950)};

        for (Competitor competitor : competitors) {
            for (Barrier barrier : barriers) {
                if (!barrier.overcome(competitor)) {
                    break;
                }
            }
        }
    }
}