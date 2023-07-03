package RockPaperScissors;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = scanner.nextLine();
        int countGame;
        while (true){
            System.out.println("Input count of game: ");
            if (scanner.hasNextInt()){
                countGame = scanner.nextInt();
                break;
            }else {
                System.out.println("Input only number ");
                scanner.nextLine();
            }
        }

        GameVoid gameVoid = new GameVoid(name, countGame);
        gameVoid.startGame(scanner);
        gameVoid.resultOnDisplay();
    }
}

