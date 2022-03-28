package competition.competitors;

public abstract class Competitor {
    protected String name;
    protected double runDistance;
    protected double jumpHeight;

    public Competitor(String name, double runDistance, double jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public String getName() {
        return name;
    }

    public double getRunDistance() {
        return runDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public abstract void run();

    public abstract void jump();
}