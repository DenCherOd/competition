package competition.competitors;

public class Human extends Competitor {


    public Human(String name, double runDistance, double jumpHeight) {
        super(name, runDistance, jumpHeight);
    }

    @Override
    public void run() {
        System.out.print(name + " пробежал ");
    }

    @Override
    public void jump() {
        System.out.print(name + " перепрынул ");
    }
}