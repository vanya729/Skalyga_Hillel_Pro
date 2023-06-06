package lessons10.homework1Polymorphism;

public class Person implements Member{

    private int maxRunDist;
    private int maxHeighJump;
    private String name;



    public Person(int maxRunDist, int maxJumpDist, String name) {
        this.maxRunDist = maxRunDist;
        this.maxHeighJump = maxJumpDist;
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
        if (height <= maxHeighJump) {
            System.out.println("Participant " + name + " successfully jumped over the height of " + height + " meters");
            return true;
        } else {
            System.out.println("Participant " + name + " failed to jump over the height of " + height + " meters");
            return false;
        }
    }
}
