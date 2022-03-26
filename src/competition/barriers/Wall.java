package competition.barriers;

import competition.competitors.Competitor;

public class Wall implements Barrier {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        if (competitor.getJumpHeight() >= height) {
            competitor.jump();
            System.out.println("перепрыгнул стену высотой " + height);
            return true;
        } else {
            System.out.println(competitor.getName() + " не перепрыгнул стену высотой " + height
                    + " .Максимальная высота прыжка " + competitor.getJumpHeight());
            return false;
        }
    }
}