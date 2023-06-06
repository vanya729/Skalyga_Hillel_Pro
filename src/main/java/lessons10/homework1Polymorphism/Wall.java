package lessons10.homework1Polymorphism;

public class Wall implements Obstacle{
    private String name = "Wall";
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean overcome(Member member) {
        return member.jump(height);
    }
}
