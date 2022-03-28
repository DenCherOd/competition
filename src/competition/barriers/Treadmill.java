package competition.barriers;

import competition.competitors.Competitor;

public class Treadmill implements Barrier {
    private double length;

    public Treadmill(double length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Competitor competitor) {
        if (competitor.getRunDistance() >= length) {
            competitor.run();
            System.out.println("Пробежал беговую дорожку на дистанции  " + length);
            return true;
        } else {
            System.out.println(competitor.getName() + " не пробежал беговую дорожку на дистанции " + length
                    + ". Пройдено " + competitor.getRunDistance());
            return false;
        }
    }
}