package lessons10.homework1Polymorphism;
public class Racetrack implements Obstacle {
    private String name = "Racetrack";
    private int length;

    public Racetrack(int length) {
        this.length = length;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Member member) {
        return member.run(length);
    }
}
