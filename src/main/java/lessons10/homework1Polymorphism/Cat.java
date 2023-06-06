package lessons10.homework1Polymorphism;

public class Cat implements Member{


    private int maxRunDist;
    private int maxJumpDist;
    private String name;


    public Cat(int maxRunDist, int maxJumpDist, String name) {
        this.maxRunDist = maxRunDist;
        this.maxJumpDist = maxJumpDist;
        this.name = name;

    }

    @Override
    public String getName() {
        System.out.println(name);
        return name;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxRunDist) {
            System.out.println("Participant " + name + " successfully ran the distance of " + distance + " meters");
            return true;
        } else {
            System.out.println("Participant " + name + " failed to run the distance of " + distance + " meters");
            return false;
        }
    }


    @Override
    public boolean jump(int height) {
        if (height <= maxJumpDist) {
            System.out.println("Participant " + name + " successfully jumped over the height of " + height + " meters");
            return true;
        } else {
            System.out.println("Participant " + name + " failed to jump over the height of " + height + " meters");
            return false;
        }
    }
}
