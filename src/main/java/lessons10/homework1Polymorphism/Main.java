package lessons10.homework1Polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Member> participants = new ArrayList<>();
        participants.add(new Person(100, 2, "John"));
        participants.add(new Cat(50, 3, "Tom"));
        participants.add(new Robot(200, 1, "Robot1"));

        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new Racetrack(80));
        obstacles.add(new Wall(2));
        obstacles.add(new Racetrack(150));
        obstacles.add(new Wall(3));

        for (Member member : participants) {
            boolean isParticipantActive = true;

            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(member)) {
                    isParticipantActive = false;
                    break;
                }
            }

            if (isParticipantActive) {
                System.out.println("Participant " + member + " completed all obstacles");
            } else {
                System.out.println("Participant " + member.getName() + " was eliminated");
            }
            System.out.println();
        }
    }
}